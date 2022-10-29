package com.taeyang_toy.springtoy.repository.impl;

import com.taeyang_toy.springtoy.domain.Member;
import com.taeyang_toy.springtoy.repository.MemberRepository;
import com.taeyang_toy.springtoy.service.MemberService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MemberRepositoryImplTest {

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
    void save() {
        Member member = new Member();
        member.setName("test");

        repository.save(member);
        Member res = repository.findById(member.getId()).orElse(null);

        assertEquals(member,res);
    }

    @Test
    void findById() {

    }

    @Test
    void findByName() {
        Member member = new Member();
        member.setName("test");
        repository.save(member);

        Member member2 = new Member();
        member2.setName("test2");
        repository.save(member2);

        Member res = repository.findByName("test").orElse(null);

        assertEquals(member,res);
    }

    @Test
    void findAll() {
        Member member = new Member();
        member.setName("test");
        repository.save(member);

        Member member2 = new Member();
        member2.setName("test2");
        repository.save(member2);

        List<Member> res = repository.findAll();
        assertEquals(2,res.size());
    }
}