package com.movie_admin.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movie_admin.service.MovieService;
import com.movie_admin.vo.MovieBean;

@RestController
public class RestAPI {
	@Inject
	MovieService movieService;
	
	@RequestMapping("/restTest")
	public String restTest(@RequestParam String str) {
		return str +" : RestAPI 테스트 완료";
	}
	
	@RequestMapping("/getDirector")
	public List<MovieBean> getDirector() {
		
		return  movieService.getMovieGrade();
	}
}
