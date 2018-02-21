package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {
    private Integer catage = 0;
    private String name = "Cat name";

    /**
     * @param name name of this Cat
     * @param age  age of this Cat
     */
    public Cat(String name, Integer age) {
        //super(name, age);
        this.name = name;
        this.catage = age;
    }

    /**
     * @param age  age of this Cat
     */
    public Cat(Integer age) {
        //super(age);
        this.catage = age;
    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
        //super(name);
        this.name = name;
    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is Cat name
     * catage is 0
     */
    public Cat() {
        //super("Cat name", 0);
        this.name = "Cat name";
        this.catage = 0;
    }

    /**
     * @return meow as a string
     */
    public String speak() {
        return "Meow";
    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public Integer getAge() {
        return this.catage;
    }
}
