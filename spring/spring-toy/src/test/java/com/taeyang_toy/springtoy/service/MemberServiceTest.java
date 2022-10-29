package com.taeyang_toy.springtoy.service;

import com.taeyang_toy.springtoy.domain.Member;
import com.taeyang_toy.springtoy.repository.MemberRepository;
import com.taeyang_toy.springtoy.repository.impl.MemberRepositoryImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService;
    MemberRepositoryImpl repository;

    @BeforeEach
    public void beforeEace(){
        repository = new MemberRepositoryImpl();
        memberService = new MemberService(repository);
    }
    @AfterEach
    void afterEach(){
        repository.clearStore();
    }

    @Test
    void join() {
        //given
        Member member = new Member();
        member.setName("test");

        //when
        Long saveId = memberService.join(member);

        //then
        Member res = memberService.findOne(member.getId()).orElse(null);
        assertEquals(res.getName(),member.getName());

    }

    @Test
    void duplicateJoin(){
        //given
        Member m1 = new Member();
        m1.setName("test");

        Member m2 = new Member();
        m2.setName("test");
        //when
        memberService.join(m1);
        assertThrows(IllegalStateException.class,()->memberService.join(m2));
        //then

    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}