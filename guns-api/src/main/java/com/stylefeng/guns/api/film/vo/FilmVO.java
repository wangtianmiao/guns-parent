package com.stylefeng.guns.api.film.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author: 磊大大
 * @date: 2018/11/3 20:19
 */
@Data
public class FilmVO implements Serializable {

    private int filmNum;
    private List<FilmInfo> filmInfo;
    private int nowPage;
    private int totalPage;



}
