package com.br.spring.codeblog.service;

import com.br.spring.codeblog.model.Post;

import java.util.List;

public interface CodeblogService {

    List<Post> findAll();

    Post findById(long id);

    Post save(Post post);
}
