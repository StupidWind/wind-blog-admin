package com.stupidwind.blog.exception.system;

import com.stupidwind.blog.enums.system.LoginEnum;

/**
 * @author: StupidWind
 * @date: 2018/12/30 20:59
 * @description: 用户不合法 异常类
 * @ver: 1.0.0
 */
public class InvalidUserException extends LoginException {

	public InvalidUserException(String message) {
		super(message);
	}

	public InvalidUserException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidUserException(LoginEnum loginEnum) {
		super(loginEnum.getMsg());
		this.loginEnum = loginEnum;
	}

}
