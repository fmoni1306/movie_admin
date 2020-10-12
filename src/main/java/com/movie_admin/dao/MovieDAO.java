package com.movie_admin.dao;

import java.util.List;

import com.movie_admin.vo.CollectionBean;
import com.movie_admin.vo.MovieBean;

public interface MovieDAO {

	List<MovieBean> getMovieGrade();

	List<CollectionBean> getMovieCollection();


	void setIdx(String idx, String type);

	CollectionBean getCollection(String type);

}
