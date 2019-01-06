package com.stupidwind.blog.service.impl.system;

import com.stupidwind.blog.dao.mapper.system.UserMapper;
import com.stupidwind.blog.domain.dto.system.LoginExcution;
import com.stupidwind.blog.domain.entity.system.User;
import com.stupidwind.blog.enums.system.LoginEnum;
import com.stupidwind.blog.exception.system.InvalidUserException;
import com.stupidwind.blog.exception.system.LoginException;
import com.stupidwind.blog.service.BaseService;
import com.stupidwind.blog.service.system.LoginServicve;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author: StupidWind
 * @date: 2019/1/6 17:27
 * @description: 登录服务接口实现类
 * @ver: 1.0.0
 */
@Service
public class LoginServiceImpl extends BaseService implements LoginServicve {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserMapper userMapper;

	@Override
	public LoginExcution doLogin(User loginUser) {
		// 校验用户合法性
		if (StringUtils.isEmpty(loginUser.getUsername())) {
			logger.error("[logger_info] invalid user, 用户名为空");
			throw new InvalidUserException(LoginEnum.USERNAME_NULL);
		}

		if (StringUtils.isEmpty(loginUser.getPassword())) {
			logger.error("[logger_info] invalid user, 密码为空");
			throw new InvalidUserException(LoginEnum.PASSWORD_NULL);
		}

		User user = userMapper.queryByUsername(loginUser.getUsername());
		if (null == user) {
			logger.info("[logger_info] unkouwn_user, 用户名不存在");
			throw new LoginException(LoginEnum.UNKOUWN_USER);
		} else if (!loginUser.getPassword().equals(user.getPassword())) {
			logger.info("[logger_info] invalid_password, 密码错误");
			throw new LoginException(LoginEnum.INVALID_PASSWORD);
		}

		logger.info("[logger_info] 登录成功! user:{}", user);
		return new LoginExcution(LoginEnum.LOGIN_SUCCESS, user);
	}

}
