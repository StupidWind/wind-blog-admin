package com.stupidwind.blog.domain.vo;

import com.stupidwind.blog.consts.ResultConst;
import lombok.Data;

/**
 * @author: StupidWind
 * @date: 2019/1/6 17:32
 * @description: 控制层返回类
 * @ver: 1.0.0
 */
@Data
public class ResultBean<T> {

	private int code;

	private String msg;

	private boolean success;

	private T data;

	public ResultBean() {

	}

	public ResultBean(boolean success, int code, String msg, T data) {
		this.success = success;
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public ResultBean(boolean success, int code, String msg) {
		this(success, code, msg, null);
	}

	public ResultBean(int code, String msg) {
		this(true, code, msg);
	}

	public ResultBean(T data) {
		this(true, ResultConst.RESULT_SUCCESS, "返回成功!", data);
	}

}
