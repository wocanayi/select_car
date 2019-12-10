package com.qtt.selectcar.user.dao;

import com.qtt.selectcar.user.entity.MemberCar;
import org.springframework.stereotype.Repository;

/**
 * @author XC
 */
@Repository
public interface MemberCarMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MemberCar record);

    MemberCar selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MemberCar record);

    int updateByPrimaryKey(MemberCar record);
}