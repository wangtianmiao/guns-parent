package com.stylefeng.guns.rest.modular.film.vo;

import com.stylefeng.guns.api.film.vo.CatVO;
import com.stylefeng.guns.api.film.vo.SourceVO;
import com.stylefeng.guns.api.film.vo.YearVO;
import lombok.Data;

import java.util.List;

/**
 * @author: 磊大大
 * @date: 2018/11/7 15:25
 */
@Data
public class FilmConditionVO {


    private List<CatVO> catInfo;
    private List<SourceVO> sourceInfo;
    private List<YearVO> yearInfo;

}
