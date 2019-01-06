package com.stupidwind.blog.service.system;

import com.stupidwind.blog.domain.dto.system.LoginExcution;
import com.stupidwind.blog.domain.entity.system.User;

/**
 * @author: StupidWind
 * @date: 2019/1/6 17:19
 * @description: 登录服务接口
 * @ver: 1.0.0
 */
public interface LoginServicve {

	/**
	 * @description 用户登录
	 * @param user 用户
	 * @author: pengx
	 * @date: 2019/1/6 17:26
	 */
	LoginExcution doLogin(User user);

}
