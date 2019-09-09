package com.stupidwind.blog.controller;

import com.stupidwind.blog.domain.entity.Article;
import com.stupidwind.blog.domain.vo.ResultList;
import com.stupidwind.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

	@GetMapping("/list")
	public ResultList<Article> list() {
		return new ResultList<>(articleService.list());
	}

}
