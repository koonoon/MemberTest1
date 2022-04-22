package com.icia.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.icia.member.dao.MemberDAO;
import com.icia.member.dto.MemberDTO;

@Service
public class MemberService {
	
	private ModelAndView mav = new ModelAndView();
	
	@Autowired
	private MemberDAO dao;

	// ModelAndView타입의 mJoin()메소드 생성
	// 매개변수로 MemberDTO타입의 member를 가져왔다
	// member에는 mId와 mPw의 데이터가 있다.
	
	// 회원가입 메소드
	public ModelAndView mJoin(MemberDTO member) {
		
		System.out.println("[2]service : " + member);
		int result = dao.mJoin(member);
		
		System.out.println("[4]service : " + result);
		if(result>0) {
			// 회원가입 성공 시 index.jsp로 이동
			mav.setViewName("index");
		} else {
			// 회원가입 실패 시 Join.jsp로 이
			mav.setViewName("Join");
		}
		
		return mav;
	}

}
