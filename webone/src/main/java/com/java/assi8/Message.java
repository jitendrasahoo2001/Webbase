package com.java.assi8;

public class Message {
	
	 private int messageId;
	 private String content;
	 private String sender;
	 
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public Message(int messageId, String content, String sender) {
		super();
		this.messageId = messageId;
		this.content = content;
		this.sender = sender;
	}
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Message [messageId=" + messageId + ", content=" + content + ", sender=" + sender + "]";
	}
	 
	 


}
