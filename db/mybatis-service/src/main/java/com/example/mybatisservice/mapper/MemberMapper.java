package com.example.mybatisservice.mapper;

import com.example.mybatisservice.entity.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MemberMapper {

    Member getList(Map<String, Object> map) throws Exception;

}
