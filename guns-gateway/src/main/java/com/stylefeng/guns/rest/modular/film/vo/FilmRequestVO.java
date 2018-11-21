package com.stylefeng.guns.rest.modular.film.vo;

/**
 * @author: 磊大大
 * @date: 2018/11/7 20:37
 */

import lombok.Data;

@Data
public class FilmRequestVO {

    private Integer showType = 1;
    private Integer sortId = 1;
    private Integer sourceId = 99;
    private Integer catId = 99;
    private Integer yearId = 99;
    private Integer nowPage = 1;
    private Integer pageSize = 18;


}
