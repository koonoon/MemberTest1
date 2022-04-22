package com.icia.member.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icia.member.dto.MemberDTO;

@Repository
public class MemberDAO {

	@Autowired
	private SqlSessionTemplate sql;
	// SQL문을 전달하기 위한 sql객체
	
	//회원가입 메소드
	public int mJoin(MemberDTO member) {	
		System.out.println("[3]dao : " + member);
		
		return sql.insert("Member.mJoin", member);
		// MemberMapper에서
		// namespace = "Member"			// id=mJoin인 곳에 작성하겠다.
	}

}
