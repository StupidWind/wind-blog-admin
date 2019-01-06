package com.stupidwind.blog.controller;

import com.stupidwind.blog.common.ResultBean;

/**
 * @author: StupidWind
 * @date: 2019/1/6 17:18
 * @description:
 * @ver: 1.0.0
 */
public class BaseController {

	private static final int RESULT_SUCCESS = 200;

	private static final int RESULT_FAILED = 500;

	public static ResultBean success() {
		return new ResultBean(RESULT_SUCCESS, true);
	}

	public static ResultBean success(int code, String msg) {
		return new ResultBean(code, msg, true);
	}

	public static ResultBean success(int code, String msg, Object data) {
		return new ResultBean(code, msg, true, data);
	}

	public static ResultBean failed() {
		return new ResultBean(RESULT_FAILED, false);
	}

	public static ResultBean failed(int code, String msg) {
		return new ResultBean(code, msg, false);
	}

	public static ResultBean failed(int code, String msg, Object data) {
		return new ResultBean(code, msg, false, data);
	}

}
