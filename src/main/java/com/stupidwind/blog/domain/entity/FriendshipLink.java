package com.stupidwind.blog.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.stupidwind.blog.domain.entity.base.BaseEntity;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author: StupidWind
 * @date: 2019/9/9 20:15
 * @description: 友链实体类
 * @ver: 1.0.0
 */
@Data
@Accessors(chain = true)
public class FriendshipLink extends BaseEntity {

	@TableId("link_id")
	private String link_id;

	@TableField("friend_name")
	private String friend_name;

	@TableField("link_url")
	private String link_url;

}
