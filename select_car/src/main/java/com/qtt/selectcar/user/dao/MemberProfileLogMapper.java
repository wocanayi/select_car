package com.qtt.selectcar.user.dao;

import com.qtt.selectcar.user.entity.MemberProfileLog;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberProfileLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MemberProfileLog record);

    MemberProfileLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MemberProfileLog record);

    int updateByPrimaryKey(MemberProfileLog record);
}