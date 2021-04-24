package com.lojavirtual.resources.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable {

	private Integer status;
	
	private String msg;
	
	private Long timeStop;

	public StandardError(Integer status, String msg, Long timeStop) {
		super();
		this.status = status;
		this.msg = msg;
		this.timeStop = timeStop;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Long getTimeStop() {
		return timeStop;
	}

	public void setTimeStop(Long timeStop) {
		this.timeStop = timeStop;
	}
	
	
	
	
}
