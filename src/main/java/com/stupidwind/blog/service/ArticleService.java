package com.stupidwind.blog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stupidwind.blog.domain.entity.Article;

/**
 * @author: StupidWind
 * @date: 2019/9/6 20:41
 * @description:
 * @ver: 1.0.0
 */
public interface ArticleService extends IService<Article> {

	/**
	 * @description 保存文章
	 * @author: stupidwind
	 * @date: 2019/9/9 20:32
	 * @param article 文章数据
	 * @return com.stupidwind.blog.domain.entity.Article
	 */
	Article doSaveArticle(Article article);

	/**
	 * @description 删除文章
	 * @author: stupidwind
	 * @date: 2019/9/9 20:52
	 * @param articleId 文章id
	 * @return com.stupidwind.blog.domain.entity.Article
	 */
	Article doDelArticle(String articleId) throws Exception;

}
