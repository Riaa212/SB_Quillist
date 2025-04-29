package com.blogwebsite.blog.proxy;

import java.util.ArrayList;
import java.util.List;

import com.blogwebsite.blog.domain.BlogImage;
import com.blogwebsite.blog.enumeration.BlogStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogProxy {

	private Integer id;
	private String title;
	private String content;
	
//	private BlogStatus blogstatus;
	
	private Integer user_id;
	
	private CategoryProxy category;
	
	private List<CommentProxy> comments;
	
    private List<String> imageUrls;

//	private List<BlogImage> blogImgs=new ArrayList<>();
	
	private Long totalComments;
	private Integer totalview;
}

