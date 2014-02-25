package  com.connectis.cbpl.integration.gateway;


import org.springframework.integration.annotation.Gateway;

import com.connectis.cbpl.domain.DomainPdf;




public interface XtransformPDFGateway{

	@Gateway
	public void sendToWs(DomainPdf pdf);

	@Gateway
	public void sendToBDD(DomainPdf recipient);
}
