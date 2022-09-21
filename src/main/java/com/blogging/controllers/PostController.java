package com.blogging.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.blogging.config.AppConstant;
import com.blogging.payLoad.PostDto;
import com.blogging.payLoad.PostResponse;

import com.blogging.services.PostService;

@RestController
@RequestMapping("/api/post")
public class PostController {

	@Autowired
	private PostService postService;
	

	// POST - Create Post
		@PostMapping("/user/{userID}/category/{categoryID}")
		public ResponseEntity<PostDto> createPost(@Valid @RequestBody PostDto postDto ,@PathVariable Integer userID ,@PathVariable Integer categoryID) {

			PostDto createPostDto = this.postService.createPost(postDto, categoryID, userID);

			return new ResponseEntity<PostDto>(createPostDto, HttpStatus.CREATED);

		}
		
		@PutMapping("/update/{postID}")
		public ResponseEntity<PostDto> updatePost( @Valid @RequestBody PostDto postDto, @PathVariable Integer postID ) {

			PostDto updatepostDto = this.postService.updatePost(postDto, postID);
			return new ResponseEntity<PostDto>(updatepostDto, HttpStatus.OK);

		}
		
		// DELETE - delete user
		@DeleteMapping("/byId/{id}")
		public ResponseEntity<?> deletePost(@PathVariable Integer id) {

			this.postService.deletePost(id);
			return new ResponseEntity<>("Success", HttpStatus.OK);

		}


		@GetMapping("/userId/{userID}")
		public ResponseEntity<List<PostDto>> findPostByUser(@PathVariable Integer userID ) {
			List<PostDto> postDto = this.postService.getPostByUserId(userID);
			
			return new ResponseEntity<List<PostDto>>(postDto, HttpStatus.OK);
		}
		
		@GetMapping("/categoryId/{categoryID}")
		public ResponseEntity<List<PostDto>> findPostByCategory(@PathVariable Integer categoryID ) {
			List<PostDto> postDto = this.postService.getPostByCategoryId(categoryID);
			
			return new ResponseEntity<List<PostDto>>(postDto, HttpStatus.OK);
		}
		@GetMapping("/allPost")
		public ResponseEntity<PostResponse> findAllPost( @RequestParam(value ="page_number" ,defaultValue = AppConstant.PAGE_NUMBER ,required = false) Integer pageNumber,
				 @RequestParam(value ="page_size" ,defaultValue = AppConstant.PAGE_SIZE ,required = false) Integer pageSize ,
				 @RequestParam(value ="sortBy" ,defaultValue = AppConstant.SORT_BY ,required = false) String sortBy,
				 @RequestParam(value ="sortDir" ,defaultValue = AppConstant.SORT_DIR,required = false) String sortDir) {
			PostResponse postResponse = this.postService.getAllPost(pageNumber, pageSize,sortBy,sortDir);
			
			return new ResponseEntity<PostResponse>(postResponse, HttpStatus.OK);
		}
		
		@GetMapping("/postId/{postID}")
		public ResponseEntity<PostDto> findPostByID(@PathVariable Integer postID ) {
			PostDto postDto = this.postService.getPostByID(postID);
			
			return new ResponseEntity<PostDto>(postDto, HttpStatus.OK);
		}
		
		// search by keywords
		@GetMapping("/search/{keywords}")
		public ResponseEntity<List<PostDto>> findPostByID(@PathVariable String keywords ) {
			List<PostDto> postDto = this.postService.searchPost(keywords);
			
			return new ResponseEntity<List<PostDto>>(postDto, HttpStatus.OK);
		}
		
		
		
		
		
}
