package com.ogiraffers.section02.abstractclass;

public class Application01 {

    public static void main (String[] args) {

        /*
        * 추상클래스와 추상 메소드
        * 추상메소드를 0개 이상 포함하는 클래스를 추상 클래스라고 한다.
        * 추상 클래스는 인스턴스를 생성할 수 없다.
        * 추상 클래스를 사용하려면 추상클래스를 상속받은 하위 클래스를 이용해서 인스턴스를 생성해야 한다.
        * 이 때 추상클래스는 상위 타입으로 사용될 수 있으며, 다형성을 이용할 수 있다.
        *
        * 추상클래스에 작성한 추상메소드는 반드시 후손이 오버라이딩 해서 작성해야 하며,
        * 후손 클래스들의 메소드들이 공통 인터페이스로의 역할을 수행할수 있다.
        * 추상클래스에 작성한 메소드를 호출하게 되면 실제 후손 타입의 인스턴스가 가지는 메소드는
        * 다형성이 적용되어 동적 바인딩에 의해 다양한 응답을 할 수 있게 된다.
        *
        * 추상 클래스를 상속받아 구현할 때는 extends 키워드를 사옹하며
        * 자바에서는 extends로 클래스를 상속받을 시 하나의 부모 클래스로만 가질 수 있다. (단일 상속)
        *
        * 추상 메소드란
        * 메소드의 선언부만 있고 구현부가 없는 메소드를 추상 메소드라고 한다.
        * 추상메소드의 경우 반드시 abstract 키워드를 메소드 헤드에 작성해야 한다.
        * public abstract class ();{
        *   public abstarct void method();
        * }
        *
        * 모든 동물은 '먹는행위'를 한다. 하지만 각각 동물마다 먹는게 다르므로 '먹는행위'를 추상화해놓고
        * 각 동물마다 먹는것을 정의해줘야 한다.
        *
        * */

//        Product pro = new Product(); //추상 클래스는 인스턴스 생성 불가


// 야구팀이라는 야구팀은 없다. 야구 class를 만들고 야구팀이라고 묶을 수 있다. 각각 상속받아 자식클래스(한화,삼성 등등)가 되는거임.

        SmartPhone smartPhone = new SmartPhone();
        // 몸체를 가졌으니 생성이 가능. 부모클래스->자식클래스로 상속. 추상클래스도 상속을 따로 해줘야함.
        smartPhone.printSmartPhone();
        smartPhone.absMethod();

        Product product = new SmartPhone(); // 2. SmartPhone(자식)은 product를 상속받았기 때문에 생성자를 생성가능
        product.absMethod();
        product.nonStaticMethod(); //1. product(부모)는 absMethod, nonStaticMethod를 갖고있으므로

    }
}
