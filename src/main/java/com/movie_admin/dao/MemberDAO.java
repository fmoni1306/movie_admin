package com.movie_admin.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.movie_admin.exception.AdminException;
import com.movie_admin.vo.AdminBean;
import com.movie_admin.vo.MemberBean;
import com.movie_admin.vo.TotalBean;


public interface MemberDAO {

	List<MemberBean> getMember();

	void isAdmin(AdminBean ab) throws AdminException;

	TotalBean getCount();

}
