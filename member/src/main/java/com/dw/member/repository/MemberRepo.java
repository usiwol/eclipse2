package com.dw.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dw.member.model.Member;

//JAP를 상속밥는다
//@Mapper를 사용하지 않는다
public interface MemberRepo extends JpaRepository<Member, Long>{ //repository == mapper
	
}
