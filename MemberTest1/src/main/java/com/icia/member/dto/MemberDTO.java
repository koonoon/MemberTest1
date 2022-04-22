package com.icia.member.dto;

public class MemberDTO {

	// 1. 필드
	// 2. 생성자
	// 3. 메소드
	
	private String mId;			// 회원아이디
	private String mPw;			// 회원비밀번호
	
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public String getmPw() {
		return mPw;
	}
	public void setmPw(String mPw) {
		this.mPw = mPw;
	}
	
	@Override
	public String toString() {
		return "MemberDTO [mId=" + mId + ", mPw=" + mPw + "]";
	}
	
	
}
