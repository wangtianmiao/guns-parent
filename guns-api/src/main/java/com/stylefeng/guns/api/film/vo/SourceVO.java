package com.stylefeng.guns.api.film.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: 磊大大
 * @date: 2018/11/7 13:44
 */
@Data
public class SourceVO implements Serializable {

    private String sourceId;
    private String sourceName;
    private boolean isActive;
}
