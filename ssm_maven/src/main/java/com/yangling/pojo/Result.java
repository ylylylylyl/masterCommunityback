package com.yangling.pojo;

import org.springframework.stereotype.Repository;
@Repository
public class Result {
	private String code;
	private String msg;
	private String result;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getResult() {
		return result;
	}
	@Override
	public String toString() {
		return "Result [code=" + code + ", msg=" + msg + ", result=" + result + "]";
	}
	public void setResult(String result) {
		this.result = result;
	}
}
