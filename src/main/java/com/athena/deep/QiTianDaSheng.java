package com.athena.deep;

import java.io.*;
import java.util.Date;

/**
 * @Author: xiaoxiang.zhang
 * @Description:齐天大圣
 * @Date: Create in 11:35 AM 2019/11/28
 */
public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {

    //每个齐天大圣都有一个金箍棒
    public JinGuBang jinGuBang;

    public QiTianDaSheng() {
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    //对齐天大圣进行深克隆
    private Object deepClone() {
        try {
            //内存中完成对象读写，通过字节码进行直接操作
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oop = new ObjectOutputStream(bos);
            oop.writeObject(this);
            //从内存中读取进来
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream oip = new ObjectInputStream(bis);

            QiTianDaSheng copy = (QiTianDaSheng) oip.readObject();
            copy.birthday = new Date();
            return copy;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    //对齐天大圣进行浅克隆
    public QiTianDaSheng shallowClone(QiTianDaSheng target) {
        QiTianDaSheng copy = new QiTianDaSheng();
        copy.height = target.height;
        copy.weight = target.weight;

        copy.jinGuBang = target.jinGuBang;
        copy.birthday = new Date();
        return copy;
    }
}
