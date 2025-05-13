package com.example.LibraryManagement.controller;


import java.util.List;
//import org.springframework.beans.factory.annotaDeleteMappingion.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.LibraryManagement.domain.Member;
import com.example.LibraryManagement.service.MemberService;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    private MemberService service;

    @GetMapping
    public List<Member> getAllMembers() {
        return service.listAll();
    }

    @PostMapping
    public void addMember(@RequestBody Member member) {
        service.save(member);
    }

    @GetMapping("/{id}")
    public Member getMember(@PathVariable Long id) {
        return service.get(id);
    }

    @PutMapping("/{id}")
    public void updateMember(@RequestBody Member member, @PathVariable Long id) {
        member.setId(id);
        service.save(member);
    }

    @DeleteMapping("/{id}")
    public void deleteMember(@PathVariable Long id) {
        service.delete(id);
    }
}

