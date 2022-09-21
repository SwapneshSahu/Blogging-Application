package com.blogging.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogging.model.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer>{

}
