package teste;

import java.awt.Dimension;
import java.util.List;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import magento.CatalogProductEntity;
import magento.CatalogProductEntityArray;
import magento.CatalogProductListRequestParam;
import magento.CatalogProductListResponseParam;
import magento.LoginParam;
import magento.LoginResponseParam;
import magento.MageApiModelServerWsiHandlerPortType;
import magento.MagentoService;

public class TesteMagentoWebService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Conexao ao WebService Magento
		MagentoService ms = new MagentoService();
		MageApiModelServerWsiHandlerPortType client = ms.getMageApiModelServerWsiHandlerPort();
		
		// Login para obter o SessionID
		LoginParam loginParam = new LoginParam();
		loginParam.setApiKey("integracao");
		loginParam.setUsername("integracao");
		LoginResponseParam loginResponse = client.login(loginParam);
		String sessionID = loginResponse.getResult();
		showInformationMessage(sessionID,"SessionID");
		
		// Obter lista de produtos
		CatalogProductListRequestParam p1 = new CatalogProductListRequestParam(); 
		p1.setSessionId(sessionID);
		CatalogProductListResponseParam r1 = client.catalogProductList(p1);
		CatalogProductEntityArray ar1 = r1.getResult();
		List<CatalogProductEntity> l1 = ar1.getComplexObjectArray();
		StringBuilder products = new StringBuilder();
		String delimitador = "|";
		String quebraLinha = "\n";
		for (CatalogProductEntity e1 : l1) {
			products.append(e1.getSku()).append(delimitador)
					.append(e1.getName()).append(quebraLinha);
		}
		showJFrame(products,"Catalogo de Produtos ["+l1.size()+"]");
		
	}

	private static void showInformationMessage(String value, String titulo) {
		JOptionPane.showMessageDialog(null, value,titulo,JOptionPane.INFORMATION_MESSAGE);
	}

	private static void showJFrame(StringBuilder names, String titulo) {
		JEditorPane editorPane = new JEditorPane();
		editorPane.setEditable(false);
        editorPane.setText(names.toString());

		//Put the editor pane in a scroll pane.
		JScrollPane editorScrollPane = new JScrollPane(editorPane);
		editorScrollPane.setVerticalScrollBarPolicy(
		                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		editorScrollPane.setPreferredSize(new Dimension(500, 600));
		editorScrollPane.setMinimumSize(new Dimension(100, 100));
		
		//Create and set up the window.
		JFrame frame = new JFrame(titulo);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Add content to the window.
		frame.add(editorScrollPane);
		
		//Display the window.
		frame.pack();
		frame.setVisible(true);
	}

}
