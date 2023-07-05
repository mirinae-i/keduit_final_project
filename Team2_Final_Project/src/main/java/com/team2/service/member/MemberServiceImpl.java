package com.team2.service.member;

import org.springframework.stereotype.Service;

import com.team2.domain.member.MemberDTO;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@AllArgsConstructor
@Slf4j
public class MemberServiceImpl implements MemberService<MemberDTO, Integer> {

	@Override
	public MemberDTO get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAdmin(MemberDTO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isValid(MemberDTO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer modify(MemberDTO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer remove(Integer key) {
		// TODO Auto-generated method stub
		return null;
	}

}
