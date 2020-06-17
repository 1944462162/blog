package com.imust.blog.service;

import com.imust.blog.domain.po.Blog;

import java.util.List;

/**
 * Author: wangJianBo
 * Date: 2020/6/17 15:16
 * Content:
 */
public interface BlogService {

    Boolean saveBlog(Blog blog);

    List<Blog> findAllBlog();
}
