package com.guilherme.bookstore.resources.exceptions;

public class StandardError {
	
	private Long timestapm;
	private Integer status;
	private String error;
	
	public StandardError() {
		super();
	}

	public StandardError(Long timestapm, Integer status, String error) {
		super();
		this.timestapm = timestapm;
		this.status = status;
		this.error = error;
	}

	public Long getTimestapm() {
		return timestapm;
	}

	public void setTimestapm(Long timestapm) {
		this.timestapm = timestapm;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}
