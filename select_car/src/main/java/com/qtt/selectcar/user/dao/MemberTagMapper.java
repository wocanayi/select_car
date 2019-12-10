package com.qtt.selectcar.user.dao;

import com.qtt.selectcar.user.entity.MemberTag;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberTagMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MemberTag record);

    MemberTag selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MemberTag record);

    int updateByPrimaryKey(MemberTag record);
}