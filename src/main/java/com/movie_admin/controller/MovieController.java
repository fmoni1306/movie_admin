package com.movie_admin.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.movie_admin.service.MovieService;
import com.movie_admin.vo.MovieBean;

@Controller
public class MovieController {
	
	@Inject
	MovieService movieService;
	
	@RequestMapping(value = "/home/movie", method = RequestMethod.GET)
	public String grade(Model model) {
		System.out.println("무비컨트롤러");
		List<MovieBean> mb = movieService.getMovieGrade();
		System.out.println(mb.get(0).getNick()+"-------------");
		model.addAttribute("MovieList",mb);
		return "table";
	}
	
}
