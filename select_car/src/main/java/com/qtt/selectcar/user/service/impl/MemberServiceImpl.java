package com.qtt.selectcar.user.service.impl;

import com.qtt.selectcar.common.result.ResultCode;
import com.qtt.selectcar.common.vo.PageBean;
import com.qtt.selectcar.common.vo.R;
import com.qtt.selectcar.dto.MemberQueryDto;
import com.qtt.selectcar.user.dao.MemberMapper;
import com.qtt.selectcar.user.entity.Member;
import com.qtt.selectcar.user.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author XC
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public R queryByMsg(String msg) {
        Member member = memberMapper.selectByMsg(msg);
        if (null == member) {
            // 查询名称不存在，说明该名称可用
            return R.OK();
        } else {
            return R.fail();
        }
    }

    @Override
    public R register(Member member) {
        // 检验是否存在
        if (queryByMsg(member.getUsername()).getCode() == ResultCode.OK.getVal()) {
            // 不存在，再新增
            int insert = memberMapper.insert(member);
            if (insert > 0) {
                return R.OK();
            } else {
                return R.fail();
            }
        } else {
            return R.fail("用户名已被注册");
        }
    }

    @Override
    public R login(String name, String pass) {
        // 根据用户名查询用户信息
        Member member = memberMapper.selectByMsg(name);
        // 检验用户是否存在
        if (null != member) {
            // 检验密码是否正确
            if (member.getPassword().equals(pass)) {
                // success
                // 令牌Token
                return R.OK(member.getId());
            }
        }
        return R.fail("用户名或密码错误");
    }

    @Override
    public R search(MemberQueryDto memberQueryDto) {
        //
        List<Member> memberList = memberMapper.selectPage(memberQueryDto.getPage(), memberQueryDto.getSize());
        PageBean<Member> pageBean = new PageBean<>();
        pageBean.setData(memberList);
        pageBean.setPage(memberQueryDto.getPage());
        pageBean.setSize(memberQueryDto.getSize());
        pageBean.setTotalPage(pageBean.getTotal()%memberQueryDto.getSize() == 0 ? pageBean.getTotal()/pageBean.getSize() : pageBean.getTotal()/pageBean.getSize() + 1);
        return R.OK(pageBean);
    }
}
