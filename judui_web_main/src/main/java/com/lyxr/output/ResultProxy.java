package com.lyxr.output;

public class ResultProxy {
	
	private Object info;
	private String msg;
	private Integer code;
	
	public Object getInfo() {
		return info;
	}
	public void setInfo(Object info) {
		if ("".equals(info)) {
			this.info = null;
		} else {
			this.info = info;
		}
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	
	
}
