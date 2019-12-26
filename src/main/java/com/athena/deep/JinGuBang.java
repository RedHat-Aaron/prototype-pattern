package com.athena.deep;

import java.io.Serializable;

/**
 * @Author: xiaoxiang.zhang
 * @Description:金箍棒类
 * @Date: Create in 11:34 AM 2019/11/28
 */
public class JinGuBang implements Serializable {

    //金箍棒的高
    public float h = 100;
    //金箍棒的宽
    public float d = 10;

    //金箍棒变大
    public void big() {
        this.h = h * 2;
        this.d = d * 2;
    }

    //金箍棒变小
    public void small() {
        this.h = h / 2;
        this.d = d / 2;
    }
}
