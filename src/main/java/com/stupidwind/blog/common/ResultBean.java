package com.stupidwind.blog.common;

import lombok.Data;

/**
 * @author: StupidWind
 * @date: 2019/1/6 17:32
 * @description: 控制层返回类
 * @ver: 1.0.0
 */
@Data
public class ResultBean {

	private int code;

	private String msg;

	private boolean success;

	private Object data;

	public ResultBean() {

	}

	public ResultBean(int code, String msg, boolean success, Object data) {
		this.code = code;
		this.msg = msg;
		this.success = success;
		this.data = data;
	}

	public ResultBean(int code, String msg, boolean success) {
		this.code = code;
		this.msg = msg;
		this.success = success;
	}

	public ResultBean(int code, boolean success) {
		this.code = code;
		this.success = success;
	}


}
