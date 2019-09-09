package com.stupidwind.blog.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.stupidwind.blog.domain.entity.base.BaseEntity;
import lombok.Data;

/**
 * @author: StupidWind
 * @date: 2019/9/6 20:42
 * @description: 文章实体类
 * @ver: 1.0.0
 */
@Data
@TableName("t_article")
public class Article extends BaseEntity {

	@TableId("article_id")
	private String article_id;

	@TableField("title")
	private String title;

	@TableField("brief")
	private String brief;

	@TableField("md_content")
	private String md_content;

	@TableField("html_content")
	private String html_content;

	@TableField("author_id")
	private String author_id;

	@TableField("author_name")
	private String author_name;

	@TableField("thumbs_up_count")
	private Integer thumbs_up_count;

	@TableField("read_count")
	private Integer read_count;

}
