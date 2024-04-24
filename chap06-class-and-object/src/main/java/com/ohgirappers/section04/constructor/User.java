package com.ohgirappers.section04.constructor;

public class User { //클래스

    private String name;
    private int age;
    private String phone;

    // 위 3가지가 여기서 갖고있는 필드


   public User() {}


    public User(String name, int age, String phone) {  //생성자는 이렇게 만듬
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
} //클래스
