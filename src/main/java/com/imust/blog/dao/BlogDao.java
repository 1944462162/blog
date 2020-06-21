package com.imust.blog.dao;

import com.imust.blog.domain.po.Blog;
import com.imust.blog.domain.po.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Author: wangJianBo
 * Date: 2020/6/17 15:18
 * Content:
 */
public interface BlogDao extends JpaRepository<Blog,Long>, JpaSpecificationExecutor<Blog> {

    @Query(value = "from Blog where typeId = ?1")
    List<Blog> findAllBlogByType(String typeId);
}
