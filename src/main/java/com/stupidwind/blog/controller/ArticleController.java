package com.stupidwind.blog.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.stupidwind.blog.consts.ResultConst;
import com.stupidwind.blog.domain.entity.Article;
import com.stupidwind.blog.domain.vo.ResultBean;
import com.stupidwind.blog.domain.vo.ResultList;
import com.stupidwind.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: StupidWind
 * @date: 2019/9/6 20:41
 * @description: 文章信息Controller
 * @ver: 1.0.0
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

	@Autowired
	private ArticleService articleService;

	@GetMapping("/get/{articleId}")
	public ResultBean<Article> getById(@PathVariable("articleId") String articleId) {
		return new ResultBean<>(true, ResultConst.RESULT_SUCCESS, "获取成功!", articleService.getById(articleId));
	}

	@PostMapping("/save")
	public ResultBean<Article> doSaveArticle(Article article) throws Exception {
		return new ResultBean<>(true, ResultConst.RESULT_SUCCESS, "保存成功", articleService.doSaveArticle(article));
	}

	@DeleteMapping("/del/{articleId}")
	public ResultBean<Article> doDelArticle(@PathVariable("articleId") String articleId) throws Exception {
		return new ResultBean<>(true, ResultConst.RESULT_SUCCESS, "删除成功!", articleService.doDelArticle(articleId));
	}

	@GetMapping("/list")
	public ResultList<Article> list(int pageNum, int pageSize) {
		Page<Article> pageParam = new Page<>(pageNum, pageSize);
		return new ResultList<>(articleService.page(pageParam));
	}

}
