package com.stylefeng.guns.rest.modular.cinema.vo;

import com.stylefeng.guns.api.cinema.vo.CinemaVO;
import lombok.Data;

import java.util.List;

/**
 * @author: 磊大大
 * @date: 2018/11/18 20:17
 */
@Data
public class CinemaListResponseVO {

    private List<CinemaVO> cinemas;
}
