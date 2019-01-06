package com.stupidwind.blog.dao.mapper.system;

import com.stupidwind.blog.domain.entity.system.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author: StupidWind
 * @date: 2019/1/6 17:22
 * @description: 用户mapper
 * @ver: 1.0.0
 */
@Repository
public interface UserMapper {

	/**
	 * @description 根据用户名查找用户
	 * @param username 用户名
	 * @author: pengx
	 * @date: 2019/1/6 17:24
	 */
	User queryByUsername(@Param("username") String username);

}
