package com.movie_admin.service;

import java.util.List;

import com.movie_admin.exception.AdminException;
import com.movie_admin.vo.AdminBean;
import com.movie_admin.vo.MemberBean;


public interface MemberService {

	List<MemberBean> getMember();

	void isAdmin(AdminBean ab) throws AdminException;

}
