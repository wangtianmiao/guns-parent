package com.stylefeng.guns.rest.modular.cinema.vo;

import com.stylefeng.guns.api.cinema.vo.CinemaInfoVO;
import com.stylefeng.guns.api.cinema.vo.FilmInfoVO;
import com.stylefeng.guns.api.cinema.vo.HallInfoVO;
import lombok.Data;

/**
 * @author: 磊大大
 * @date: 2018/11/18 21:01
 */
@Data
public class CinemaFieldResponseVO {

    private CinemaInfoVO cinemaInfo;
    private FilmInfoVO filmInfo;
    private HallInfoVO hallInfo;
}
