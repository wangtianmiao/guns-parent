package com.stylefeng.guns.api.cinema.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: 磊大大
 * @date: 2018/11/14 20:51
 */
@Data
public class HallInfoVO implements Serializable {

    private String hallFieldId;
    private String hallName;
    private String price;
    private String seatFile;
    //已售座位必须关联订单才能查询
    private String soldSeats;
}
