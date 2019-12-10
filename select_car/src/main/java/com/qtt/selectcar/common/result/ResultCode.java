package com.qtt.selectcar.common.result;

/**
 * @author XC
 */

public enum ResultCode {
    OK(200), ERROR(400), NOTFOUNT(404);

    private int val;

    private ResultCode(int v) {
        val = v;
    }

    public int getVal() {
        return val;
    }
}
