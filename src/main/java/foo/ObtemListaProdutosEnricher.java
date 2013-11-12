package foo;

import java.util.List;

import magento.CatalogProductEntity;
import magento.CatalogProductEntityArray;
import magento.CatalogProductListRequestParam;
import magento.CatalogProductListResponseParam;
import magento.LoginParam;
import magento.LoginResponseParam;
import magento.MageApiModelServerWsiHandlerPortType;
import magento.MagentoService;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ObtemListaProdutosEnricher implements Processor {

	@Override
	public void process(Exchange e) throws Exception {
		// Conexao ao WebService Magento
		MagentoService ms = new MagentoService();
		MageApiModelServerWsiHandlerPortType client = ms.getMageApiModelServerWsiHandlerPort();
		
		// Login para obter o SessionID
		LoginParam loginParam = new LoginParam();
		loginParam.setApiKey("integracao");
		loginParam.setUsername("integracao");
		LoginResponseParam loginResponse = client.login(loginParam);
		String sessionID = loginResponse.getResult();
		
		// imprime sessionID no console
		System.out.print("SessionID ["+ sessionID +"]");
		
		// Obter lista de produtos
		CatalogProductListRequestParam p1 = new CatalogProductListRequestParam(); 
		p1.setSessionId(sessionID);
		CatalogProductListResponseParam r1 = client.catalogProductList(p1);
		CatalogProductEntityArray ar1 = r1.getResult();
		List<CatalogProductEntity> l1 = ar1.getComplexObjectArray();
		
		// Converte para texto
		StringBuilder products = new StringBuilder();
		String delimitador = "|";
		String quebraLinha = "\n";
		for (CatalogProductEntity e1 : l1) {
			products.append(e1.getSku()).append(delimitador)
					.append(e1.getName()).append(quebraLinha);
		}

		e.getIn().setBody(products.toString());
	}

}
