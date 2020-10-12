package com.movie_admin.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movie_admin.service.MovieService;
import com.movie_admin.vo.CollectionBean;
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
	
	@RequestMapping("/getCollection1")
	public List<CollectionBean> getCollection1() {
		CollectionBean li = movieService.getCollection("1");
		
		String[] movieSeq = li.getMovieSeq().split(",");
		String[] title = li.getTitle().split(",");
		String[] poster = li.getPoster().split(",");
		List<CollectionBean> list = new ArrayList<CollectionBean>(); 
		
		for(int i=0; i<movieSeq.length ; i++) {
			CollectionBean cb = new CollectionBean();
			cb.setCollection_name(li.getCollection_name());
			cb.setMovieSeq(movieSeq[i]);
			cb.setTitle(title[i]);
			cb.setPoster(poster[i]);
			list.add(cb);
		}
		
		return list;
	}
	@RequestMapping("/getCollection2")
	
	public List<CollectionBean> getCollection2() {
		CollectionBean li = movieService.getCollection("2");
		String[] movieSeq = li.getMovieSeq().split(",");
		String[] title = li.getTitle().split(",");
		String[] poster = li.getPoster().split(",");
		List<CollectionBean> list = new ArrayList<CollectionBean>(); 
		
		for(int i=0; i<movieSeq.length ; i++) {
			CollectionBean cb = new CollectionBean();
			cb.setCollection_name(li.getCollection_name());
			cb.setMovieSeq(movieSeq[i]);
			cb.setTitle(title[i]);
			cb.setPoster(poster[i]);
			list.add(cb);
		}
		
		return list;
	}
}
