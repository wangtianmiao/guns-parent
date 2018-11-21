package com.stylefeng.guns.api.cinema.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author: 磊大大
 * @date: 2018/11/14 20:29
 */
@Data
public class FilmInfoVO implements Serializable {

    private String filmId;
    private String filmName;
    private String filmLength;
    private String filmType;
    private String filmCats;
    private String actors;
    private String imgAddress;
    private List<FilmFieldVO> filmFields;
}
