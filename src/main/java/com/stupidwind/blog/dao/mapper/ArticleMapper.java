package com.stupidwind.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stupidwind.blog.domain.entity.Article;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: StupidWind
 * @date: 2019/9/6 20:51
 * @description: 文章mapper
 * @ver: 1.0.0
 */
@Mapper
public interface ArticleMapper extends BaseMapper<Article> {

}
