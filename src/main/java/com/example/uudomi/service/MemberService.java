package com.example.uudomi.service;

import com.example.uudomi.dto.MemberDto;
import com.example.uudomi.entity.Member;
import com.example.uudomi.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public Member memberInsert(MemberDto dto){
//      MemberDto dto => dto.toEntity(); => Member member;
//      Entity 는 DB 와 맞닿는 핵심 클래스이고 Entity를 기준으로 테이블이 생성되고 스키마 변경이 되어,
//      최대한 Entity의 속성 변경시킬 위험을 줄이기위해 직접적으로 사용X 그래서 DTO사용
        return memberRepository.save(dto.toEntity());
    }

    public List<Member> findMember() {
        return memberRepository.findAll();
    }

    public Optional<Member> findByIdMember(Long id) {
        return memberRepository.findById(id);
    }

    public Member updateMember(Long id, MemberDto dto) {
//      JPA는 수정이 없어서 수정할 id를 받아와서 setId를 한후 save로 수정
        dto.setId(id);
        return memberRepository.save(dto.toEntity());
    }

    public boolean deleteMember(Long id) {
        memberRepository.deleteById(id);
        return memberRepository.findById(id).isEmpty();
    }
}
