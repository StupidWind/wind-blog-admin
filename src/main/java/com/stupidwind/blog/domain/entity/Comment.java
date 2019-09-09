package com.stupidwind.blog.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.stupidwind.blog.domain.entity.base.BaseEntity;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author: StupidWind
 * @date: 2019/9/9 20:12
 * @description: 评论实体类
 * @ver: 1.0.0
 */
@Data
@Accessors(chain = true)
public class Comment extends BaseEntity {

	@TableId("comment_id")
	private String comment_id;

	@TableField("content")
	private String content;

	@TableField("user_id")
	private String user_id;

	@TableField("user_name")
	private String user_name;

	@TableField("user_ip")
	private String user_ip;

	@TableField("parent_id")
	private String parent_id;

	@TableField("target_id")
	private String target_id;

	@TableField("target_type")
	private String target_type;

}
