package com.stylefeng.guns.api.film.vo;

import com.stylefeng.guns.api.film.vo.ActorVO;
import lombok.Data;

import java.util.List;

/**
 * @author: 磊大大
 * @date: 2018/11/10 15:00
 */

@Data
public class ActorRequestVO {

    private ActorVO director;
    private List<ActorVO> actors;
}
