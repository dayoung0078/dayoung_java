package com.ohgirappers.section06.singleton;

public class EagerSingleton {

    private static EagerSingleton singleton = new EagerSingleton(); //

    private EagerSingleton(){
        System.out.println("Eager 생성됨");

    }

    public static EagerSingleton getInstance(){ // 상위에서 private하게 만들면 사용할 수 없으니 public으로...
        return singleton;
    }
}
