package com.qtt.selectcar.user.view;

import com.qtt.selectcar.common.vo.R;
import com.qtt.selectcar.dto.MemberQueryDto;
import com.qtt.selectcar.user.entity.Member;
import com.qtt.selectcar.user.service.MemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author XC
 */
@Api(value = "用户的相关操作", tags = "用户的相关操作")
// 标记返回的是字符串 json/xml格式
@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/api/user/member/checkName.do")
    @ApiOperation(value = "校验用户的注册名称是否重复", notes = "校验用户的注册名称是否重复")
    public R checkMsg(String msg) {
        return memberService.queryByMsg(msg);
    }

    @PostMapping("/api/user/member/register.do")
    @ApiOperation(value = "用户的注册", notes = "用户的注册")
    public R register(@RequestBody Member member) {
        return memberService.register(member);
    }

    @GetMapping("/api/user/member/login.do")
    @ApiOperation(value = "用户的登录", notes = "用户的登录")
    public R login(String name, String password) {
        return memberService.login(name, password);
    }

    @PostMapping("/api/user/member/page.do")
    @ApiOperation(value = "用户的分页", notes = "用户的分页")
    public R page(@RequestBody MemberQueryDto queryDto) {
        return memberService.search(queryDto);
    }
}
