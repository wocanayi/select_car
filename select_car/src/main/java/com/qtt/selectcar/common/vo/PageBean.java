package com.qtt.selectcar.common.vo;

import lombok.Data;

import java.util.List;

/**
 * @author XC
 */
@Data
public class PageBean<T> {
    private int page;
    private int total;
    private int size;
    private long totalPage;
    private List<T> data;
}
