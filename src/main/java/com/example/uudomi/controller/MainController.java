package com.example.uudomi.controller;

import com.example.uudomi.dto.MemberDto;
import com.example.uudomi.entity.Member;
import com.example.uudomi.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/main")
public class MainController {

    private final MemberService memberService;

    // view 관련
//    @GetMapping("/test")
//    public String test(Model model) {
//        model.addAttribute("name", "UJ");
//        return "test";
//    }

    @GetMapping("/list")
    public String listMember (Model model) {
        List<Member> member = memberService.findMember();
//        for (Member member1 : member) {
//            log.info(member1.getName());
//        }
        model.addAttribute("list", member);
        return "list";
    }



    //api 관련
    @ResponseBody
    @PostMapping("/user")
    public Member insertMember (@RequestBody MemberDto dto) {
        return memberService.memberInsert(dto);
    }

    @ResponseBody
    @GetMapping("/user")
    public List<Member> findAllMember () {
        return memberService.findMember();
    }

    @ResponseBody
    @GetMapping("/user/{id}")
    public Optional<Member> findByIdMember (@PathVariable Long id) {
        return memberService.findByIdMember(id);
    }

    @ResponseBody
    @PutMapping("/user/{id}")
    public Member updateMember (@PathVariable Long id, @RequestBody MemberDto dto) {
        return memberService.updateMember(id, dto);
    }

    @ResponseBody
    @DeleteMapping("/user/{id}")
    public boolean deleteMember (@PathVariable Long id) {
        return memberService.deleteMember(id);
    }
}
