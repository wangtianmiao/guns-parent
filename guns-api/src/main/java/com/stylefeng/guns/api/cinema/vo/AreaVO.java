package com.stylefeng.guns.api.cinema.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: 磊大大
 * @date: 2018/11/14 20:21
 */

@Data
public class AreaVO implements Serializable {


    private String areaId;
    private String areaName;
    private boolean isActive;
}
