package com.ogirappers.section01.list.run;

import java.util.*;

public class Application {

    public static void main(String[] args) {

        ArrayList alist = new ArrayList();

        List list = new ArrayList(); // 배열은 인덱스기준으로 왔다갔다 할 수 있음.

        Collection clist = new ArrayList();

        alist.add("apple"); //0
        alist.add(123);  // 1
        alist.add(45.322);  //2
        alist.add(new Date());  //3



        //list의 길이를 확인할 때 size를 이용한다.
        System.out.println(alist.size());

        for (int i = 0; i < alist.size(); i++) {
            // 특정 인덱스의 값을 꺼내온다.
            System.out.println(alist.get(i));
        }

        System.out.println();
        //값을 수정한다.
        alist.set(0, "이것을 수정함");
        for (int i = 0; i < alist.size(); i++) {
            //특정 인덱스의 값을 꺼내온다.
            System.out.println(alist.get(i));
        }

        System.out.println("변경테스트");

        String target = "사용자입력값";
        //특정 인덱스의 값을 수정한다.
        alist.add(0,target);
        System.out.println(alist.get(0)); // 0번째 인덱스를 가져올 수 있음


        //리스트는 스트링타입으로 변경해줌. 그래서 숫자를 넣으면 에러남.
        List<String> stringlist = new ArrayList<>();
        stringlist.add("안녕");
        stringlist.add("10");
        System.out.println(stringlist);


        List<String> stringList = new ArrayList<>();
        stringlist.add("apple");
        stringlist.add("orange");
        stringlist.add("mango");
        stringlist.add("grape");
        System.out.println(stringlist);


        Collections.sort(stringlist); //원본배열에 영향을 준다. (sort가)
        //(자바클래스)(sort 정렬메소드)
        System.out.println(stringlist);

        stringlist = new LinkedList<>(stringlist);

        /*
        * Iterator란?
        * Collection 인터페이스의 iterator() 메소드를 이용해서 인스턴스를 생성할 수 있다.
        * 컬렉션에서 값을 읽어오는 방식을 통일된 방식으로 제공하기 위해 사용된다.
        * 반복자라고 부리우며, 반복문을 이용해서 목록을 하나씩 꺼내오는 방식으로 사용하기 위함이다.
        * 인덱스로 관리되는 컬렉션이 아닌 경우에는 반복문을 사용해서 요소에 하나씩 접근할 수 없기 때문에
        * 인덱스를 사용하지 않고 반복문을 사용하기 위한 목록을 만들어주는 역할이라고 보면 된다.
        * hasNext() : 다음 요소를 가지고 있는 경우 true, 더이상 요소가 없는 경우 false를 반환
        * next : 다음 요소를 반환
        * */

        Iterator<String> dIter = ((LinkedList<String>) stringlist).descendingIterator();

//        while (dIter.hasNext()){
//            System.out.println(dIter.next());
//        }
//        System.out.println(dIter);

        List<String> descList = new ArrayList<>();
        while (dIter.hasNext()){
            descList.add(dIter.next());
        }

        for (int i = 0; i < descList.size(); i++);{
            System.out.println(descList.get(i));
        }


    }
}
