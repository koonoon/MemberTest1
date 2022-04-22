package com.icia.member.controller;



import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.icia.member.dto.MemberDTO;
import com.icia.member.service.MemberService;

@Controller
public class MemberController {

	// ModelAndView 객체 생성
	private ModelAndView mav = new ModelAndView();
	
	@Autowired
	private MemberService msvc;
	// MemberService에 연결하기 위해 @Autowired사용, msvc객체 생성
	
	// int num => 숫자
	// String str => "문자열"
	// ModelAndView mav => Model과 View 정보
	
	// 프로젝트 실행 시 첫 화면! => value = "/"
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {		
		return "index";
	}
	
		// 페이지만 이동하는 경우
		// 메소드의 데이터타입은 String 
		// 메소드 이름은 기능을 유추할 수 있도록 정해준다
		// 메소드의 리턴 타입은 String 타입으로 
	
	// Join : 회원가입 페이지로 이동 메소드
	@RequestMapping(value = "/Join", method = RequestMethod.GET)
	public String Join() {		
		return "Join";
	}
	
	// M : Model (DTO:Object)
	// V : View (jsp)
	// C : Controller
	
	// memberJoin : 회원가입메소드
	@RequestMapping(value = "/memberJoin", method = RequestMethod.POST)
	public ModelAndView mJoin(@ModelAttribute MemberDTO member) {		// member = mId, mPw
		System.out.println("[1]controller : " + member);
		
		mav = msvc.mJoin(member);
		// mav는 서비스에 있는 mJoin(member)메소드 값을 호출한다.
		
		System.out.println("[5]controller : " + mav);
		return mav;
		
	}
	
	
}
