package com.stupidwind.blog.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: StupidWind
 * @date: 2019/9/2 19:51
 * @description: mybatis-plus配置
 * @ver: 1.0.0
 */
@Configuration
@MapperScan("com.stupidwind.blog.dao.mapper")
public class MybatisPlusConfiguration {

	@Bean
	public PaginationInterceptor paginationInterceptor() {
		return new PaginationInterceptor();
	}

}
