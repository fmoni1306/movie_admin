package com.movie_admin.dao;

import java.util.List;

import com.movie_admin.vo.CollectionBean;
import com.movie_admin.vo.MovieBean;
import com.movie_admin.vo.ReviewBean;

public interface MovieDAO {

	List<MovieBean> getMovieGrade();

	List<CollectionBean> getMovieCollection();


	void setIdx(String idx, String type);

	CollectionBean getCollection(String type);

	List<ReviewBean> getReview();

	void deleteReview(String idx);

}
