package com.blogging.services.impl;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.blogging.exception.ResourceNotFoundException;
import com.blogging.model.Category;
import com.blogging.model.Post;
import com.blogging.model.User;
import com.blogging.payLoad.PostDto;
import com.blogging.payLoad.PostResponse;
import com.blogging.repo.CategoryRepo;
import com.blogging.repo.PostRepo;
import com.blogging.repo.UserRepo;
import com.blogging.services.PostService;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private PostRepo postRepo;
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private CategoryRepo categoryRepo;
	@Autowired
	private UserRepo userRepo;

	@Override
	public PostDto createPost(PostDto postDto, Integer categoryID, Integer userID) {
		Category category = this.categoryRepo.findById(categoryID)
				.orElseThrow(() -> new ResourceNotFoundException("Category", "id", categoryID));
		User user = this.userRepo.findById(userID)
				.orElseThrow(() -> new ResourceNotFoundException("User", "id", userID));

		Post post = this.modelMapper.map(postDto, Post.class);

		post.setAddedDate(new Date());
		post.setUser(user);
		post.setCategory(category);
		this.postRepo.save(post);

		return this.modelMapper.map(post, PostDto.class);
	}

	@Override
	public PostDto updatePost(PostDto postDto, Integer postId) {

		Post post = this.postRepo.findById(postId)
				.orElseThrow(() -> new ResourceNotFoundException("Post", "id", postId));

		post.setTitle(postDto.getTitle());
		post.setContent(postDto.getContent());

		this.postRepo.save(post);

		return this.modelMapper.map(post, PostDto.class);
	}

	@Override
	public PostDto getPostByID(Integer postId) {
		Post post = this.postRepo.findById(postId)
				.orElseThrow(() -> new ResourceNotFoundException("Post", "id", postId));
		PostDto postDto = this.modelMapper.map(post, PostDto.class);
		return postDto;
	}

	@Override
	public PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir) {

		Sort sort = null;
		if (sortDir.equalsIgnoreCase("asc"))
			sort = Sort.by(sortBy).ascending();
		else {
			sort = Sort.by(sortBy).descending();
		}

		Pageable p = PageRequest.of(pageNumber, pageSize, sort);

		Page<Post> pagePost = this.postRepo.findAll(p);

		List<Post> allPost = pagePost.getContent();
		System.out.println(allPost);
		List<PostDto> postDtoList = allPost.stream().map((post) -> this.modelMapper.map(post, PostDto.class))
				.collect(Collectors.toList());

		PostResponse postResponse = new PostResponse();

		postResponse.setContent(postDtoList);
		postResponse.setPageNumber(pagePost.getNumber());
		postResponse.setPageSize(pagePost.getSize());
		postResponse.setTotalElement(pagePost.getTotalElements());
		postResponse.setTotalPages(pagePost.getTotalPages());
		postResponse.setLastPage(pagePost.isLast());

		return postResponse;

	}

	@Override
	public void deletePost(Integer postId) {

		Post post = this.postRepo.findById(postId)
				.orElseThrow(() -> new ResourceNotFoundException("Post", "id", postId));

		this.postRepo.delete(post);
	}

	@Override
	public List<PostDto> getPostByCategoryId(Integer categoryID) {
		Category category = this.categoryRepo.findById(categoryID)
				.orElseThrow(() -> new ResourceNotFoundException("Category", "id", categoryID));

		List<PostDto> postDtoList = this.postRepo.findByCategory(category).stream()
				.map((post) -> this.modelMapper.map(post, PostDto.class)).collect(Collectors.toList());
		return postDtoList;
	}

	@Override
	public List<PostDto> getPostByUserId(Integer userID) {
		User user = this.userRepo.findById(userID)
				.orElseThrow(() -> new ResourceNotFoundException("User", "id", userID));

		List<PostDto> postDtoList = this.postRepo.findByUser(user).stream()
				.map((post) -> this.modelMapper.map(post, PostDto.class)).collect(Collectors.toList());
		return postDtoList;
	}

	@Override
	public List<PostDto> searchPost(String Keyword) {
		//List<Post>	posts = this.postRepo.searchByTitle("%" + Keyword +"%") ;
		List<Post>	posts = this.postRepo.findByTitleContaining( Keyword );
		List<PostDto> postDtoList = posts.stream()
				.map((post) -> this.modelMapper.map(post, PostDto.class)).collect(Collectors.toList());
		return postDtoList;
	}

}
