package com.stylefeng.guns.api.cinema.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: 磊大大
 * @date: 2018/11/14 20:26
 */
@Data
public class CinemaInfoVO implements Serializable {

    private String cinemaId;
    private String imgUrl;
    private String cinemaName;
    private String cinemaAdress;
    private String cinemaPhone;
}
