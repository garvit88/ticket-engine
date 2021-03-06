package com.stackroute.eplay.ticketengine.service;

import org.springframework.messaging.simp.SimpMessagingTemplate;

class CommService {

	private static SimpMessagingTemplate template;

	public static void setTemplate(SimpMessagingTemplate tmplt) {
		template = tmplt;
	}

	public static void send(String message) {
		template.convertAndSend("/chat", message);
	}
}