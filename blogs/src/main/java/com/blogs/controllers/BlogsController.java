package com.blogs.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogsController {

	@RequestMapping("/names")
	public List<String> retrieveNames(){
		return Arrays.asList("A","B","C");
	}
}
