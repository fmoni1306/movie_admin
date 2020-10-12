package com.movie_admin.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.movie_admin.exception.AdminException;
import com.movie_admin.vo.AdminBean;
import com.movie_admin.vo.MemberBean;
import com.movie_admin.vo.TotalBean;
import com.sun.org.apache.xml.internal.utils.NameSpace;

@Repository
public class MemberDAOImpl implements MemberDAO{

	@Inject
	SqlSession sqlsession;
	
	private static final String namespace = "com.movie_admin.mapper.MemberMapper";
	
	@Override
	public List<MemberBean> getMember() {
		return sqlsession.selectList(namespace+".getMember");
	}

	
	@Override
	public void isAdmin(AdminBean ab) throws AdminException {
		
		AdminBean getAdmin = sqlsession.selectOne(namespace+".isAdmin");
		
		
		if(getAdmin.getId().equals(ab.getId())) {
			if(getAdmin.getPass().equals(ab.getPass())) {
			
			}else {
				throw new AdminException("패스워드 틀림");
			}
		}else {
			throw new AdminException("아이디 틀림");
		}
	}


	@Override
	public TotalBean getCount() {
		
		return sqlsession.selectOne(namespace+".getCount");
	}
	
	
	
	

}
