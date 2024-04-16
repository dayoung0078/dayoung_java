package main.java.com.ohgiraffers.section01.method;

public class Application03 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        Application03 app3 = new Application03();
        int result = app3.plus(x, y);
        System.out.println(result);
        String info = app3.myInfo("김다영", 20, '여', "010-8846-5953");
        System.out.println(info);

        System.out.println(app3.myInfo("김다영", 20, '여',"010-8846-5953"));
    }


    // 두 수를 더하는 함수
    // 접근제어자, 반환타입 ,함수명(매개변수) {함수의 몸체spope}

    public int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    public String myInfo(String name, int age, char gender, String phoneNumber){
        String result = name + age + gender + phoneNumber;
        return result;
    /*
     * myinfo함수를 만들고
     * 이름 : 문자열
     * 나이 : 정수
     * 성별 : 문자
     * 전화번호 : '-'을 포함한 전화번호
     *
     * 위 4개의 자료형을 매개변수로 받아 하나의 문자열로 더하고 main에서 출력해주세요
     * */





        }
    }

