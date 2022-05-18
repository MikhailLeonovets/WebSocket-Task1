package com.itechart.websocket_task.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OutputMessage {
	private Message message;
	private String time;

	public OutputMessage(String sendTo, String text, String time) {
		this.message = new Message(sendTo, text);
		this.time = time;
	}
}
