package com.athena.simple;

import java.util.List;

/**
 * @Author: xiaoxiang.zhang
 * @Description:
 * @Date: Create in 10:58 AM 2019/11/28
 */
public class ConcreatePrototypeA implements Prototype {

    private int age;

    private String name;

    private List<String> hobbies;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public Prototype clone() {
        ConcreatePrototypeA copy = new ConcreatePrototypeA();
        copy.setAge(this.age);
        copy.setName(this.name);
        copy.setHobbies(this.hobbies);
        return copy;
    }
}
