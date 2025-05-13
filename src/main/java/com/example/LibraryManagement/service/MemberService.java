package com.example.LibraryManagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.LibraryManagement.domain.Member;
import com.example.LibraryManagement.repository.MemberRepository;

@Service
public class MemberService {

    @Autowired
    private MemberRepository repo;

    public List<Member> listAll() {
        return repo.findAll();
    }

    public void save(Member member) {
        repo.save(member);
    }

    public Member get(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}

