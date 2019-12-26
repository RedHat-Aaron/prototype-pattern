package com.athena.deep;

/**
 * @Author: xiaoxiang.zhang
 * @Description:
 * @Date: Create in 3:02 PM 2019/11/28
 */
public class DeepCloneTest {
    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        try {
            QiTianDaSheng deep = (QiTianDaSheng) qiTianDaSheng.clone();
            System.out.println("深克隆:" + (qiTianDaSheng.jinGuBang == deep.jinGuBang));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        QiTianDaSheng q = new QiTianDaSheng();
        QiTianDaSheng c = q.shallowClone(q);
        System.out.println("浅克隆：" + (q.jinGuBang == c.jinGuBang));

    }
}
