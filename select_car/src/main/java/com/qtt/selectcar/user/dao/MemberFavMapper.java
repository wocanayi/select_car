package com.qtt.selectcar.user.dao;


import com.qtt.selectcar.user.entity.MemberFav;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberFavMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MemberFav record);

    MemberFav selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MemberFav record);

    int updateByPrimaryKey(MemberFav record);
}