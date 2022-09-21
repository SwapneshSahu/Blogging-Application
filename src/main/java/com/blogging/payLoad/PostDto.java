package com.blogging.payLoad;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.blogging.model.Category;
import com.blogging.model.Comment;
import com.blogging.model.User;

public class PostDto {

	private Integer postid;
	private String title;
	private String content;
	
	private Date addedDate;
	
	private  Set<CommentDto> comments = new HashSet<>();
	
	private UserDto user;

	private CategoryDto category;

	
	public Integer getPostid() {
		return postid;
	}

	public void setPostid(Integer postid) {
		this.postid = postid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	public CategoryDto getCategory() {
		return category;
	}

	public void setCategory(CategoryDto category) {
		this.category = category;
	}

	public Set<CommentDto> getComments() {
		return comments;
	}

	public void setComments(Set<CommentDto> comments) {
		this.comments = comments;
	}



	
	
	
}
