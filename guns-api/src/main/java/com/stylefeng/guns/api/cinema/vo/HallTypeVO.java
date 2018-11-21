package com.stylefeng.guns.api.cinema.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: 磊大大
 * @date: 2018/11/14 20:21
 */

@Data
public class HallTypeVO implements Serializable {


    private String halltypeId;
    private String halltypeName;
    private boolean isActive;
}
