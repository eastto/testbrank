package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Description：xxxx<br/>
 * Copyright (c) ，2020 ， tianzhuY <br/>
 * This program is protected by copyright laws. <br/>
 * Date： 2020年02月15日
 *
 * @author ytz
 * @version : 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PayMent implements Serializable {

    private Long id;
    private String serial;

}
