package com.stylefeng.guns.api.film.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: 磊大大
 * @date: 2018/11/7 13:45
 */
@Data
public class YearVO implements Serializable {

    private String yearId;
    private String yearName;
    private boolean isActive;
}
