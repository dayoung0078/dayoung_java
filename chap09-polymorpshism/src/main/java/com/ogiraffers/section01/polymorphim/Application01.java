package com.ogiraffers.section01.polymorphim;

public class Application01 {

    public static void main(String[] args) {
        /*
        * 다형성
        *   /* 필기.
         *  다형성의 장점
         *  1. 여러 타입의 객체를 하나의 타입으로 관리할 수 있기 때문에 유지보수성과 생산성이 증가된다.
         *  2. 상속을 기반으로 한 기술이기 때문에 상속관계에 있는 모든 객체는 동일한 메세지를 수신할 수 있다.
         *     이런 동일한 메세지를 수신받아 처리하는 내용을 객체별로 다르게 할 수 있다는 장점을 가지고 있다.
         *     (다양한 기능을 사용하는데 있어서 관리해야 할 메세지 종류가 줄어들게 된다.)
         *     하나의 호출로 여러 가지 동작을 수행할 수 있다는 측면에서 오버로딩을 다형성으로 보기도 한다.
         *     다형성을 이해하기 쉬운 가장 좋은 예 이기도 하다.
         *     하지만 이 부분은 이견이 많이 존재하기 때문에 다형성을 이해하는데 참고로만 활용하자.
         *  3. 확장성이 좋은 코드를 작성할 수 있다.
         *  4. 결합도를 낮춰서 유지보수성을 증가시킬 수 있다.
         * */


        Rabbit rabbit = new Rabbit();
        rabbit.cry();
        rabbit.eat();
        rabbit.run();
        rabbit.jump();

        System.out.println("================");

        Animal animal = rabbit; // 래빗이나 애니멀이나 같은 주소를 가짐
        animal.cry();  // 토끼에서 생성된 타입에서 출력됨. not animal
        animal.eat();
        animal.run();

        System.out.println("================");

//        Rabbit rabbit1 = (Rabbit) new Animal(); // 토끼는 동물이다.(o) 동물은 토끼다(x) 불가능

        Rabbit rabbit1 = (Rabbit)animal; //어캐스팅. (Rabbit)<-자료 '형변환'해서 비활성화된 jump를 활성화시켜줌
        rabbit1.jump();
        rabbit1.cry();


        Animal[] animals = new Animal[5];
        animals[0] = new Rabbit();
        animals[1] = new Tiger();
        animals[2] = new Animal();
        animals[3] = new Rabbit();
        animals[4] = new Tiger();



        // foreach문이 중요함. 여기서 다형성을 사용함. 샷추가 되는 음료들을(커피종류) 묶어서 500원 추가 이렇게 사용할 수 있음
        for (Animal a : animals) {
            System.out.println("시작~~~~~");
            a.run();
            a.eat();
            a.cry();
            if (a instanceof Tiger) { // 결과는 true or false
                ((Tiger) a).bite();
            } else if (a instanceof Rabbit) {  // a랑 Rabbit의 클래스가 같아? 라고 물어 보는것 (instanceof operator) <-객체의 클래스를 알아내기
                ((Rabbit) a).jump();
            }
            System.out.println("종료~~~~~");
        }

    }
}
