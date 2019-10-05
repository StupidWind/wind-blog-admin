package com.stupidwind.blog.controller;

import com.stupidwind.blog.controller.base.BaseController;
import com.stupidwind.blog.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author StupidWind
 * @version 1.0.0
 * @className CommentController
 * @description 评论信息Controller
 * @date 2019/10/3 13:22
 **/
@RestController
@RequestMapping("/comment")
public class CommentController extends BaseController {

    @Autowired
    private CommentService commentService;

}
