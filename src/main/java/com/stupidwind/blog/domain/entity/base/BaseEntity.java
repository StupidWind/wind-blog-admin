package com.stupidwind.blog.domain.entity.base;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author: StupidWind
 * @date: 2019/9/2 20:14
 * @description: 基础实体类
 * @ver: 1.0.0
 */
@Data
@Accessors(chain = true)
public class BaseEntity {

	// 是否启用
	@TableLogic
	@TableField("ifuse")
	private Boolean ifuse;

	// 创建时间
	@TableField(value = "create_time", fill = FieldFill.INSERT)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date createTime;

	// 更新时间
	@TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date updateTime;

}
