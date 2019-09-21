package com.stupidwind.blog.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.stupidwind.blog.domain.entity.base.BaseEntity;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author: StupidWind
 * @date: 2019/9/6 20:42
 * @description: 文章实体类
 * @ver: 1.0.0
 */
@Data
@TableName("t_article")
@Accessors(chain = true)
public class Article extends BaseEntity {

	@TableId("article_id")
	private String articleId;

	@TableField("title")
	private String title;

	@TableField("brief")
	private String brief;

	@TableField("md_content")
	private String mdContent;

	@TableField("html_content")
	private String htmlContent;

	@TableField("author_id")
	private String authorId;

	@TableField("author_name")
	private String authorName;

	@TableField("thumbs_up_count")
	private Integer thumbsUpCount = 0;

	@TableField("read_count")
	private Integer readCount = 0;

}
