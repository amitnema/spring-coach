package org.apn.tutorial;

public class MessagePrinter {

	private MessageService messageService;

	public void printMessage() {
		System.out.println(this.messageService.getMessage());
	}

	public MessageService getMessageService() {
		return messageService;
	}

	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

}
