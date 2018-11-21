package com.stylefeng.guns.api.cinema.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: 磊大大
 * @date: 2018/11/14 20:31
 */
@Data
public class FilmFieldVO implements Serializable {

    private String fieldId;
    private String beginTime;
    private String endTime;
    private String language;
    private String hallName;
    private String price;

}
