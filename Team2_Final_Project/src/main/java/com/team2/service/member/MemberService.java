package com.team2.service.member;

public interface MemberService<VO, K> {

	// 회원정보 보기
	public VO get();
	
	// 일반 회원/관리자 체크
	// 1: 일반 회원, 2~8: 스태프, 9: 관리자
	public boolean isAdmin(VO vo);
	
	// 유효한 회원인지 체크
	// 1: 유효, 0: 탈퇴한 회원
	public boolean isValid(VO vo);

	// 회원정보 수정
	public Integer modify(VO vo);

	// 회원 탈퇴
	public Integer remove(K key);

}
