package com.athena.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiaoxiang.zhang
 * @Description:原型模式测试类
 * @Date: Create in 11:04 AM 2019/11/28
 */
public class SimplePrototypeTest {
    public static void main(String[] args) {
        ConcreatePrototypeA protoType = new ConcreatePrototypeA();
        protoType.setAge(18);
        protoType.setName("小王");
        List<String> hobbies = new ArrayList<String>();
        protoType.setHobbies(hobbies);

        //直接调用也是ok的
        //protoType.clone();

        Client client = new Client();
        ConcreatePrototypeA copy = (ConcreatePrototypeA) client.startClone(protoType);
        System.out.println("克隆对象中引用类型地址的值：" + copy.getHobbies());
        System.out.println("原对象中引用类型地址的值：" + protoType.getHobbies());
        System.out.println("比较克隆对象和原对象中引用类型地址的值：" + (protoType.getHobbies() == copy.getHobbies()));

        System.out.println(protoType == copy);

    }
}
