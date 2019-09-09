package com.stupidwind.blog.domain.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.stupidwind.blog.domain.entity.base.BaseEntity;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author: StupidWind
 * @date: 2019/9/9 20:11
 * @description: 类别实体类
 * @ver: 1.0.0
 */
@Data
@Accessors(chain = true)
public class Category extends BaseEntity {

	@TableId("category_id")
	private String category_id;

	@TableField("category_name")
	private String category_name;

}
