package com.ohgirappers.section06.singleton;

public class LazySingleton {

    private static LazySingleton lazy;

    private LazySingleton() {
        System.out.println("Lazy 생성됨");
    }
    public static LazySingleton getInstance() {


        if (lazy == null) {

            lazy = new LazySingleton();
        }

        return lazy;
    }
}


