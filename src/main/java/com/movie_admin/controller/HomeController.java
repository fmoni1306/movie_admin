package com.movie_admin.controller;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.movie_admin.exception.AdminException;
import com.movie_admin.service.MemberService;
import com.movie_admin.vo.AdminBean;
import com.movie_admin.vo.MemberBean;
import com.movie_admin.vo.TotalBean;

@Controller
public class HomeController {

	@Inject
	MemberService memberService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main() {
		return "main";
	}
	
	@RequestMapping(value = "/home/main", method = RequestMethod.GET)
	public String home(Model model) {
		TotalBean tb =  memberService.getCount();
		System.out.println(tb.getGradeCount()+"11111");
		model.addAttribute("count",tb);
		return "home";
	}
	
	
	
	

}

