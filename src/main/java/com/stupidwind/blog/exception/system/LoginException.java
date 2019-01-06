package com.stupidwind.blog.exception.system;

import com.stupidwind.blog.enums.system.LoginEnum;

/**
 * @author: StupidWind
 * @date: 2018/12/30 20:57
 * @description: 登录异常类
 * @ver: 1.0.0
 */
public class LoginException extends RuntimeException {

	protected LoginEnum loginEnum;

	public LoginException(String message) {
		super(message);
	}

	public LoginException(String message, Throwable cause) {
		super(message, cause);
	}

	public LoginException(LoginEnum loginEnum) {
		super(loginEnum.getMsg());
		this.loginEnum = loginEnum;
	}

	public LoginEnum getLoginInfo() {
		return this.loginEnum;
	}

}
