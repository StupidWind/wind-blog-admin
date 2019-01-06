package com.stupidwind.blog.domain.dto.system;

import com.stupidwind.blog.domain.entity.system.User;
import com.stupidwind.blog.enums.system.LoginEnum;
import lombok.Data;

/**
 * @author: StupidWind
 * @date: 2019/1/6 17:35
 * @description:
 * @ver: 1.0.0
 */
@Data
public class LoginExcution {

	private int code;

	private String msg;

	private User user;

	public LoginExcution(int code, String msg, User user) {
		// 用户密码设为空, 对前台不可见
		user.setPassword(null);
		this.code = code;
		this.msg = msg;
		this.user = user;
	}

	public LoginExcution(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public LoginExcution(LoginEnum loginEnum) {
		this.code = loginEnum.getCode();
		this.msg = loginEnum.getMsg();
	}

	public LoginExcution(LoginEnum loginEnum, User user) {
		user.setPassword(null);
		this.code = loginEnum.getCode();
		this.msg = loginEnum.getMsg();
		this.user = user;
	}

}
