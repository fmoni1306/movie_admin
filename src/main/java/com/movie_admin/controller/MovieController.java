package com.movie_admin.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.movie_admin.service.MovieService;
import com.movie_admin.vo.CollectionBean;
import com.movie_admin.vo.MovieBean;
import com.movie_admin.vo.ReplyBean;
import com.movie_admin.vo.ReviewBean;

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
		return "movie";
	}
	
	@RequestMapping(value = "/home/collection", method = RequestMethod.GET)
	public String collection(Model model) {
		System.out.println("컬렉션컨트롤러");
		List<CollectionBean> cb = movieService.getMovieCollection();
		model.addAttribute("collectionList",cb);
		return "collection";
	}
	@RequestMapping(value = "/home/collectionIdx", method = RequestMethod.GET)
	public String collection(HttpServletRequest request) {
		System.out.println("컬렉션컨트롤러Idx");
		String idx = request.getParameter("idx");
		String type = request.getParameter("type");
			movieService.setMovieIdx(idx,type);
		System.out.println(idx);
		return "collection";
	}
	
	@RequestMapping(value = "/home/report", method = RequestMethod.GET)
	public String report(Model model) {
		System.out.println("컬렉션컨트롤러");
		List<ReviewBean> list = movieService.getReviewBean();
		model.addAttribute("ReviewBean",list);
		return "report";
	}
	
	@RequestMapping(value = "/home/deleteReview", method = RequestMethod.GET)
	public String deleteReview(HttpServletRequest request) {
		System.out.println("컬렉션컨트롤러");
		String idx = request.getParameter("idx");
		movieService.deleteReview(idx);
		return "report";
	}
	
	
	
}
