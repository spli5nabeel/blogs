package com.blogs.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogsController {

	@RequestMapping("/names")
	public List<String> retrieveNames(){
		return Arrays.asList("A","B","C");
	}
	
	
	@RequestMapping("/hosts")
	public String hosts(@RequestParam(name="ip", defaultValue = "0.0.0.0") String ip) {
		return ip;
	}
}
