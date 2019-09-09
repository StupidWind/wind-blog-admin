package com.stupidwind.blog.domain.vo;

import com.stupidwind.blog.consts.ResultConst;
import lombok.Data;

import java.util.List;

/**
 * @author: StupidWind
 * @date: 2019/9/6 20:56
 * @description:
 * @ver: 1.0.0
 */
@Data
public class ResultList<T> {

	private int code;

	private String msg;

	private boolean success;

	private List<T> list;

	public ResultList() {

	}

	public ResultList(int code, String msg, boolean success, List<T> list) {
		this.code = code;
		this.msg = msg;
		this.success = success;
		this.list = list;
	}

	public ResultList(int code, String msg, boolean success) {
		this(code, msg, success, null);
	}

	public ResultList(int code, String msg) {
		this(code, msg, true);
	}

	public ResultList(List<T> list) {
		this(ResultConst.RESULT_SUCCESS, "返回成功!", true, list);
	}

}
