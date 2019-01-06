package com.stupidwind.blog.domain.entity.system;

import lombok.Data;

import java.util.Date;

/**
 * @author: StupidWind
 * @date: 2019/1/6 17:19
 * @description: 用户 实体类
 * @ver: 1.0.0
 */
@Data
public class User {

	// 用户id
	private String userId;

	// 用户名
	private String username;

	// 密码
	private String password;

	// 昵称
	private String nickName;

	// 头像url
	private String avatarUrl;

	// 性别
	private String gender;

	// 手机号
	private Long userPhone;

	// 邮箱
	private String userEmail;

	// 地址
	private String address;

	// 是否启用
	private String ifuse;

	// 创建时间
	private Date createTime;

	// 更新时间
	private Date updateTime;

	@Override
	public String toString() {
		return "User{" +
				"userId='" + userId + '\'' +
				", username='" + username + '\'' +
				", nickName='" + nickName + '\'' +
				", avatarUrl='" + avatarUrl + '\'' +
				", gender='" + gender + '\'' +
				", userPhone=" + userPhone +
				", userEmail='" + userEmail + '\'' +
				", address='" + address + '\'' +
				", ifuse='" + ifuse + '\'' +
				", createTime=" + createTime +
				", updateTime=" + updateTime +
				'}';
	}
}
