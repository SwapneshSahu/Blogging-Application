package com.blogging.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.blogging.model.Category;
import com.blogging.model.Post;
import com.blogging.model.User;

public interface PostRepo extends JpaRepository<Post,Integer> {
	
	String $key = null;

	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	
	List<Post> findByTitleContaining(String title);
	
//	//@Query("select p from Posts p  where p.title like : key")
//	@Query("select * from posts  where post_title = $key" )
//	List<Post> searchByTitle( @Param ("key")  String title);

}
