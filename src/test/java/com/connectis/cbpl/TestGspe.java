package com.connectis.cbpl;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.integration.Message;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:externalWsPing.xml"})
public class TestGspe {
	@Resource(name = "fahrenheitChannel")
	MessageChannel channel;
	
	
	@Test
	public  void testChannel() {
	
			// Compose the XML message according to the server's schema
		String requestXml =
				"<FahrenheitToCelsius xmlns=\"http://www.w3schools.com/webservices/\">" +
				"    <Fahrenheit>55</Fahrenheit>" +
				"</FahrenheitToCelsius>";

		// Create the Message object
		Message<String> message = MessageBuilder.withPayload(requestXml).build();

		// Send the Message to the handler's input channel
		//MessageChannel channel = channelResolver.resolveChannelName("fahrenheitChannel");
		channel.send(message);
	}
}
