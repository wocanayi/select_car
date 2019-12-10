package com.qtt.selectcar.user.dao;

import com.qtt.selectcar.user.entity.Member;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author XC
 */
@Repository
public interface MemberMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Member record);

    Member selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);

    Member selectByMsg(String msg);


    List<Member> selectPage(@Param("page") int page, @Param("size") int size);
    long selectCount();
}