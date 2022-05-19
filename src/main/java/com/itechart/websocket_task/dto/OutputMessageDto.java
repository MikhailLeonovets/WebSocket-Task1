package com.itechart.websocket_task.dto;

import lombok.Getter;

@Getter
public class OutputMessageDto {
	private String from;
	private String text;
	private String time;

	public OutputMessageDto(final String from, final String text, final String time) {
		this.from = from;
		this.text = text;
		this.time = time;
	}
}
