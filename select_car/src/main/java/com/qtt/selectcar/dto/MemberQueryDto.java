package com.qtt.selectcar.dto;

import lombok.Data;

/**
 * @author XC
 */
@Data
public class MemberQueryDto {
    private int page;
    private int size;
    private String name;
    private int sex;
}
