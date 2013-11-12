package foo;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class BaristaQuente implements Processor {

	@Override
	public void process(Exchange e) throws Exception {
		 //Object body = e.getIn().getBody();
		 //System.out.print("Dentro do baristaQuente "+ body);
		 
		 Thread.sleep(1000);
		 
		 //throw new Exception("TESTE DE EXCEPTION");
		 
		
	}

}
