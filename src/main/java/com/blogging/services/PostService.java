package com.blogging.services;

import java.util.List;

import com.blogging.payLoad.PostDto;
import com.blogging.payLoad.PostResponse;

public interface PostService {

	
	PostDto createPost(PostDto postDto ,Integer categoryID ,Integer userID);
	PostDto updatePost(PostDto postDto ,Integer userId);
	PostDto getPostByID(Integer postId);
	PostResponse getAllPost(Integer pageNumber, Integer pageSize,String sortBy,String sortDir);
	
	void deletePost(Integer postId);
	
	List<PostDto> getPostByCategoryId( Integer categoryID);
	
	List<PostDto> getPostByUserId( Integer userID);
	
	List<PostDto> searchPost(String Keyword);
	
	
}
