package com.movie_admin.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.movie_admin.vo.MovieBean;

@Repository
public class MovieDAOImpl implements MovieDAO {

	@Inject
	SqlSession sqlSession;
	
	private final static String namespace = "com.movie_admin.mapper.MovieMapper";
	
	@Override
	public List<MovieBean> getMovieGrade() {
		System.out.println("무비 디에이오");
		
		return sqlSession.selectList(namespace+".getMovieGrade"); 
	}

}
