package com.qtt.selectcar.user.dao;

import com.qtt.selectcar.user.entity.MemberProfile;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberProfileMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MemberProfile record);

    MemberProfile selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MemberProfile record);

    int updateByPrimaryKey(MemberProfile record);
}