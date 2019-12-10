package com.qtt.selectcar.common.vo;

import com.qtt.selectcar.common.result.ResultCode;
import lombok.Data;

/**
 * @author XC
 * @Date 2019年12月10日20:37:35
 */
@Data
public class R {
    private int code;
    private String msg;
    private Object data;

    public static R setR(int code, String msg, Object data) {
        R r = new R();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public static R OK(Object data) {
        return setR(ResultCode.OK.getVal(), "OK", data);
    }

    public static R OK() {
        return setR(ResultCode.OK.getVal(), "OK", null);
    }

    public static R fail(String msg) {
        return setR(ResultCode.ERROR.getVal(), msg, null);
    }

    public static R fail() {
        return setR(ResultCode.ERROR.getVal(), "ERROR", null);
    }
}
