package com.brunoroberto.cursomc.resources.exception;

import java.io.Serializable;

public class StanderError implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer status;
	private String msg;
	private Long timerStamp;

	public StanderError(Integer status, String msg, Long timerStamp) {
		super();
		this.status = status;
		this.msg = msg;
		this.timerStamp = timerStamp;
	}

	public StanderError() {
		super();
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

	public Long getTimerStamp() {
		return timerStamp;
	}

	public void setTimerStamp(Long timerStamp) {
		this.timerStamp = timerStamp;
	}

}
