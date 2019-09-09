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

	public ResultBean(int code, String msg, boolean success, T data) {
		this.code = code;
		this.msg = msg;
		this.success = success;
		this.data = data;
	}

	public ResultBean(int code, String msg, boolean success) {
		this(code, msg, success, null);
	}

	public ResultBean(int code, String msg) {
		this(code, msg, true);
	}

	public ResultBean(T data) {
		this(ResultConst.RESULT_SUCCESS, "返回成功!", true, data);
	}

}
