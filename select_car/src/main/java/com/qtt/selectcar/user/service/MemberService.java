package com.qtt.selectcar.user.service;


import com.qtt.selectcar.common.vo.R;
import com.qtt.selectcar.dto.MemberQueryDto;
import com.qtt.selectcar.user.entity.Member;

/**
 * @author XC
 */
public interface MemberService {

    /**
     * 查询
     *
     * @param msg 用户账号
     * @return
     */
    R queryByMsg(String msg);

    /**
     * 注册
     *
     * @param member
     * @return
     */
    R register(Member member);

    /**
     * 登录
     *
     * @param name
     * @param pass
     * @return
     */
    R login(String name, String pass);

    /**
     * 后台管理系统 搜索接口 分页
     *
     * @param memberQueryDto
     * @return
     */
    R search(MemberQueryDto memberQueryDto);
}
