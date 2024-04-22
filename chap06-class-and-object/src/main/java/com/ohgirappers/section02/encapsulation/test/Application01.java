package com.ohgirappers.section02.encapsulation.test;

public class Application01 {

    public static void main(String[] args) {
       Book[] books = new Book[3];
       Person[] persons = new Person[3];

        books[0] = new Book();
        books[0].name="자바의 정석";
        books[0].author="홍길동";
        books[0].number="100";

        books[1] = new Book();
        books[1].name="데이터베이스 개론";
        books[1].author="안창호";
        books[1].number="200";

        books[2] = new Book();
        books[2].name="알고리즘 기초";
        books[2].author="윤봉길";
        books[2].number="300";

        Person song = new Person();
        song.Name = "송재희";
        song.book = books[2];

      // 게터 세터

       Person person = new Person();





    }
}
