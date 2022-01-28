package com.example.mybatisservice.service;

import com.example.mybatisservice.entity.Member;
import com.example.mybatisservice.mapper.MemberMapper;
import com.example.mybatisservice.request.MemberParams;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MemberService {

    MemberMapper memberMapper;

    public MemberService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public Member getList(MemberParams params) throws Exception {
        Map<String, Object> paramMap = new HashMap<String, Object>();

        paramMap.put("id", params.getId());

        return memberMapper.getList(paramMap);
    }
}
