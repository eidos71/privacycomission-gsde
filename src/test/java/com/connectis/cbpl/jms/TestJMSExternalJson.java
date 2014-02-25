package com.connectis.cbpl.jms;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.integration.MessageChannel;
import org.springframework.integration.core.MessageHandler;
import org.springframework.integration.core.MessagingTemplate;
import org.springframework.integration.core.PollableChannel;
import org.springframework.integration.core.SubscribableChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.connectis.cbpl.domain.DomainPdf;

@ContextConfiguration("classpath:org/siia/tilumusic/gateway/ExternalGatewaysJMS.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class TestJMSExternalJson {
	@Resource(name = "objectMapperInput")
	MessageChannel objectMapperInput;

	@Test
	public void testSend() {
		DomainPdf domainPdf= new DomainPdf();
		domainPdf.setPdfUrl("/test/test.pdf");
		domainPdf.setStatus("pending");
		
		objectMapperInput.send(MessageBuilder.withPayload(domainPdf).build(), 1000);
	}

}
