package com.stupidwind.blog.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.stupidwind.blog.domain.entity.Article;
import com.stupidwind.blog.service.ArticleService;
import com.stupidwind.blog.service.base.BaseService;
import com.stupidwind.blog.utils.CommonUtils;
import com.stupidwind.blog.utils.UUIDUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.Date;
import java.util.Optional;

/**
 * @author: StupidWind
 * @date: 2019/9/6 20:55
 * @description: 文章Service实现类
 * @ver: 1.0.0
 */
@Service
public class ArticleServiceImpl extends BaseService<Article> implements ArticleService {

	private Article getArticleOfNonNull(String articleId) throws Exception {
		Assert.notNull(articleId, "文章id不能为空");
		return Optional.ofNullable(getById(articleId)).orElseThrow(() -> new Exception("文章不存在"));
	}

	@Override
	public Article doSaveArticle(Article article) throws Exception {
		if (StringUtils.isEmpty(article.getArticleId())) {
			article.setArticleId(UUIDUtils.getDatabaseId("A"));
			save(article);
		} else {
			Article existArticle = getArticleOfNonNull(article.getArticleId());
			BeanUtils.copyProperties(article, existArticle, CommonUtils.getNullPropertyNames(article));
			update(existArticle, Wrappers.<Article>lambdaUpdate().set(Article::getUpdateTime, new Date()).eq(Article::getArticleId, article.getArticleId()));
		}
		return article;
	}

	@Override
	public Article doDelArticle(String articleId) throws Exception {
		Article article = getArticleOfNonNull(articleId);
		removeById(articleId);
		return article;
	}

}
