package com.stupidwind.blog.controller.system;

import com.stupidwind.blog.common.ResultBean;
import com.stupidwind.blog.controller.BaseController;
import com.stupidwind.blog.domain.dto.system.LoginExcution;
import com.stupidwind.blog.domain.entity.system.User;
import com.stupidwind.blog.enums.system.LoginEnum;
import com.stupidwind.blog.exception.system.InvalidUserException;
import com.stupidwind.blog.exception.system.LoginException;
import com.stupidwind.blog.service.system.LoginServicve;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: StupidWind
 * @date: 2019/1/6 17:18
 * @description: 登陆 Controller
 * @ver: 1.0.0
 */
@RestController
@RequestMapping("/login")
public class LoginController extends BaseController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private LoginServicve loginServicve;

	@PostMapping(value = "/doLogin", produces = { "application/json" })
	public ResultBean doLogin(User user) {

		try {
			logger.info("[logger_info] 用户登录, username:{}", user.getUsername());
			LoginExcution res = loginServicve.doLogin(user);
			return this.success(res.getCode(), res.getMsg(), res.getUser());
		} catch (InvalidUserException e1) {
			LoginExcution excution = new LoginExcution(e1.getLoginInfo());
			return this.failed(excution.getCode(), excution.getMsg());
		} catch (LoginException e2) {
			LoginExcution excution = new LoginExcution(e2.getLoginInfo());
			return this.failed(excution.getCode(), excution.getMsg());
		} catch (Exception e) {
			LoginExcution excution = new LoginExcution(LoginEnum.SYSTEM_ERROR);
			return this.failed(excution.getCode(), excution.getMsg());
		}
	}

}
