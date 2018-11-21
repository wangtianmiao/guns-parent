package com.stylefeng.guns.api.film;

import com.stylefeng.guns.api.film.vo.*;

import java.util.List;

/**
 * @author: 磊大大
 * @date: 2018/11/4 18:03
 */
public interface FilmAsyncServiceApi {



    //查询影片的详细信息 -> Dubbo的异步获取
    FilmDescVO getFilmDesc(String filmId);

    //获取图片信息
    ImgVO getImgs(String filmId);

    //获取导演信息
    ActorVO getDectInfo(String filmId);

    //获取演员信息
    List<ActorVO> getActors(String filmId);

}
