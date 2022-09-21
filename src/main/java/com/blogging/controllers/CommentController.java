package com.blogging.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogging.payLoad.CommentDto;
import com.blogging.payLoad.PostDto;
import com.blogging.services.CommentService;

@RestController
@RequestMapping("/api/comment")
public class CommentController {

	@Autowired
	private CommentService commentService;

	// POST - Create user
	@PostMapping("/post/{postID}")
	public ResponseEntity<CommentDto> createComment(@Valid @RequestBody CommentDto commentDto,
			@PathVariable Integer postID) {

		CommentDto commentDto1 = commentService.createComment(commentDto, postID);

		return new ResponseEntity<CommentDto>(commentDto1, HttpStatus.CREATED);

	}

	@DeleteMapping("/delete/{commentId}")
	public ResponseEntity<?> deleteComment(
			@PathVariable Integer commentId) {

   commentService.deleteComment(commentId);

		return new ResponseEntity<>("Success", HttpStatus.OK);

	}
}
