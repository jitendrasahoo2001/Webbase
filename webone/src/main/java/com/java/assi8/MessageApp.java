package com.java.assi8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;

public class MessageApp {
	public static final Logger Log = Logger.getLogger("com.java.assi7.MessageApp");


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ExecutorService executorService = Executors.newFixedThreadPool(3);

	        Message message1 = new Message(1, "Hello!", "Alice");
	        Message message2 = new Message(2, "Hi there!", "Bob");
	        Message message3 = new Message(3, "Good morning!", "Charlie");

	        MessageInt messageProcessor = MessageImpl.getInstance();
	        executorService.submit(() -> messageProcessor.processMessage(message1));
	        executorService.submit(() -> messageProcessor.processMessage(message2));
	        executorService.submit(() -> messageProcessor.processMessage(message3));

	        executorService.shutdown();

	}

}
