package com.java.assi8;

import org.apache.log4j.Logger;

public class MessageImpl implements MessageInt  {
    private static MessageImpl instance;
    
	public static final Logger Log = Logger.getLogger("com.java.assi7.MessageImpl");
	
    private MessageImpl() {}
    
    public static synchronized MessageImpl getInstance() {
        if (instance == null) {
            instance = new MessageImpl();
        }
        return instance;
    }




	@Override
	public void processMessage(Message message) {
		// TODO Auto-generated method stub
		Log.info("Processing message: " + message);
        // Simulate time-consuming task
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        	Log.error("Thread interrupted while processing message: " + message);
            Thread.currentThread().interrupt();
        }
        Log.info("Message processed successfully: " + message);
		
	}

}
