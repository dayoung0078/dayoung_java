package com.ogiraffers.section02.abstractclass;

public abstract class Product {

    private int nonStaticField;

    private static int staticField;


    public Product() {

    }

    public void nonStaticMethod() {
        System.out.println("Product 클래스의 nonStaticMethod 호출함");

    }

    public void staticMethod() {
        System.out.println("Product 클래스의 staticMethod 호출함");
    }

    public abstract void absMethod(); //abstract - 추상적

}


// product 추상화에서 필요한 것 - nonStaticField, public Product(){}, public void nonStaticMethod(), public abstract void abs Method(); 가 필요
