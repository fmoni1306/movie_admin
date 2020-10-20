package com.movie_admin.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.movie_admin.vo.CollectionBean;
import com.movie_admin.vo.MovieBean;
import com.movie_admin.vo.ReviewBean;

@Repository
public class MovieDAOImpl implements MovieDAO {

	private final static String type1 = "1";
	private final static String type2 = "2";
	
	@Inject
	SqlSession sqlSession;
	
	private final static String namespace = "com.movie_admin.mapper.MovieMapper";
	
	@Override
	public List<MovieBean> getMovieGrade() {
		System.out.println("무비 디에이오");
		
		return sqlSession.selectList(namespace+".getMovieGrade"); 
	}

	@Override
	public List<CollectionBean> getMovieCollection() {
		return sqlSession.selectList(namespace+".getMovieCollection");
	}

	@Override
	public void setIdx(String str,String type) {
		
		if(type.equals(type1)) {
			sqlSession.insert(namespace+".setCollectionIdx",str);
		}else {
			sqlSession.insert(namespace+".setCollectionIdx2",str);
		}
	}

	@Override
	public CollectionBean getCollection(String type) {
		
		if(type.equals(type1)) {
			return sqlSession.selectOne(namespace+".getCollection1");
		}else {
			System.out.println("여긴오나요 겟컬렉션2");
			return sqlSession.selectOne(namespace+".getCollection2");
		}
		
		
	}

	@Override
	public List<ReviewBean> getReview() {
		
		return sqlSession.selectList(namespace+".getReviewReport");
	}

	@Override
	public void deleteReview(String idx) {
		System.out.println("여기옴?"+idx);
		sqlSession.delete(namespace+".deleteReview", idx);
	}
	
	
	
	
	
	
	
	
	

}
