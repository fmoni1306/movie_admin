package com.movie_admin.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.movie_admin.dao.MovieDAO;
import com.movie_admin.vo.CollectionBean;
import com.movie_admin.vo.MovieBean;

@Service
public class MovieServiceImpl implements MovieService {
	@Inject
	MovieDAO movieDAO;
	
	@Override
	public List<MovieBean> getMovieGrade() {
		System.out.println("무비 서비스");
		return 	movieDAO.getMovieGrade();
	}

	@Override
	public List<CollectionBean> getMovieCollection() {
		
		return movieDAO.getMovieCollection();
	}

	@Override
	public void setMovieIdx(String idx,String type) {
		movieDAO.setIdx(idx,type);
	}

	@Override
	public CollectionBean getCollection(String type) {
		
		return movieDAO.getCollection(type);
	}
	
	

	
}
