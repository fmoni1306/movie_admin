package com.movie_admin.controller;

import java.util.List;

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

@Controller
public class MemberController {

	@Inject
	MemberService memberService;
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(AdminBean ab, Model model,HttpSession session) {
		System.out.println(ab.getId()+"오냐");
		try {
			memberService.isAdmin(ab);
			session.setAttribute("id", ab.getId());
			return "redirect:/home/main";
		} catch (AdminException e) {
			String result = e.getMessage();
			model.addAttribute("loginResult", result);
			return "main";
		}
	}
	
	@RequestMapping(value = "member/table", method = RequestMethod.GET)
	public String getMember(Model model) {
		
		List<MemberBean> list = memberService.getMember();
		model.addAttribute("memberList", list);
		return "tables";
	}

}
