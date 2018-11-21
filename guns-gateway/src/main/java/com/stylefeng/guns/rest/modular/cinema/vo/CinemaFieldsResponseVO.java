package com.stylefeng.guns.rest.modular.cinema.vo;

import com.stylefeng.guns.api.cinema.vo.CinemaInfoVO;
import com.stylefeng.guns.api.cinema.vo.FilmInfoVO;
import lombok.Data;

import java.util.List;

/**
 * @author: 磊大大
 * @date: 2018/11/18 20:48
 */
@Data
public class CinemaFieldsResponseVO {

    private CinemaInfoVO cinemaInfoVO;
    private List<FilmInfoVO> filmList;
}
