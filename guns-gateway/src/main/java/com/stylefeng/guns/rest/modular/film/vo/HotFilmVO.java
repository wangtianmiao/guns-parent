package com.stylefeng.guns.rest.modular.film.vo;

import com.stylefeng.guns.api.film.vo.FilmInfo;
import lombok.Data;

import java.util.List;

/**
 * @author: 磊大大
 * @date: 2018/11/3 20:19
 */
@Data
public class HotFilmVO {

    private int filmNum;
    private List<FilmInfo> filmInfo;


}
