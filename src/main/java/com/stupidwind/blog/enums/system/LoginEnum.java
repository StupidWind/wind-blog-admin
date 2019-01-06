package com.stupidwind.blog.enums.system;

/**
 * @author: StupidWind
 * @date: 2019/1/6 17:36
 * @description: 登录枚举类
 * @ver: 1.0.0
 */
public enum LoginEnum {

	LOGIN_SUCCESS(200, "登录成功"),
	UNKOUWN_USER(-1, "用户不存在"),
	INVALID_PASSWORD(-2, "密码错误"),
	NO_PERMISSION(-3, "权限不足"),
	USERNAME_NULL(-4, "用户名为空"),
	PASSWORD_NULL(-5, "密码为空"),
	SYSTEM_ERROR(400, "系统异常");

	private int code;

	private String msg;

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	LoginEnum(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public static LoginEnum valueOf(int index) {
		for (LoginEnum item : values()) {
			if (item.getCode() == index) {
				return item;
			}
		}
		return null;
	}

}
