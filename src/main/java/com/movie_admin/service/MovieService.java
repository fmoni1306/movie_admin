package com.movie_admin.service;

import java.util.List;

import com.movie_admin.vo.CollectionBean;
import com.movie_admin.vo.MovieBean;
import com.movie_admin.vo.ReviewBean;

public interface MovieService {

	List<MovieBean> getMovieGrade();

	List<CollectionBean> getMovieCollection();


	void setMovieIdx(String idx, String type);

	CollectionBean getCollection(String string);

	List<ReviewBean> getReviewBean();

	void deleteReview(String idx);

}
