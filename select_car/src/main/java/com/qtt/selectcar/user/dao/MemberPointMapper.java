package com.qtt.selectcar.user.dao;

import com.qtt.selectcar.user.entity.MemberPoint;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberPointMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MemberPoint record);

    MemberPoint selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MemberPoint record);

    int updateByPrimaryKey(MemberPoint record);
}