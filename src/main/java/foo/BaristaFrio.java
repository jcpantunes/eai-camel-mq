package foo;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class BaristaFrio implements Processor {

	@Override
	public void process(Exchange e) throws Exception {
		 //Object body = e.getIn().getBody();
		 //System.out.print("Dentro do baristaFrio "+ body);
		 
		 Thread.sleep(400);
		
	}

}
