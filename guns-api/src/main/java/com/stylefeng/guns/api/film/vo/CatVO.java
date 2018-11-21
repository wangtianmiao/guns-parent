package com.stylefeng.guns.api.film.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: 磊大大
 * @date: 2018/11/7 13:42
 */
@Data
public class CatVO implements Serializable {
    private String catId;
    private String catName;
    private boolean isActive;
}
