package com.stylefeng.guns.api.cinema.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: 磊大大
 * @date: 2018/11/14 20:03
 */
@Data
public class CinemaVO implements Serializable {

    private String uuid;
    private String cinemaName;
    private String address;
    private String minimumPrice;
}
