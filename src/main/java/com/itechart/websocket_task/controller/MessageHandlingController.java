package com.itechart.websocket_task.controller;

import com.itechart.websocket_task.model.Message;
import com.itechart.websocket_task.dto.OutputMessageDto;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class MessageHandlingController {

	@MessageMapping("/chat")
	@SendTo("/topic/messages")
	public OutputMessageDto send(Message message) {
		String time = new SimpleDateFormat("HH:mm").format(new Date());
		return new OutputMessageDto(message.getFrom(), message.getText(), time);
	}

}
