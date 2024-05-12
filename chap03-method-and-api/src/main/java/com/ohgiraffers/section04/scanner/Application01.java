package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner; // 우리눈에 보이지 않지만 java.util이라는 경로가 있다.
    // 패키지/패키지/클래스
        public class Application01 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in); //스캐너로 쓸 수 있는 모든걸 불러온다. sc를 new Scanner로 명명한다.
            // sc 변수명 ==메모리의 주소 == 값
            //Scanner - 자바가 만든 사람들이 만든 자료형, OS를 만질 수 있는 권한을 필수로 넣어줘야함.

            Application01 app1 = new Application01();
            String info = app1.inputInfo();
            System.out.println(info);


        /*    System.out.println("당신의 이름을 입력해주세요 : ");
            String name = sc.nextLine();
            System.out.println("입력하신 당신의 이름은" + name + "입니다.");

            // 쓰레드 : 동시에 뭔가 작동시킬 수 있다.
            // https://deftkang.tistory.com/55 --nextline()에 관한 내용정리

            System.out.println("당신의 나이를 입력해주세요 :");
            int age = sc.nextInt();
            System.out.println("당신의 나이는" + age + "세 입니다.");
*/
        /*
         * inputInfo 메서드를 만들고
         * 사용자의 이름 키 성별 나이를 입력받아 main에서 출력해주세요.

         1. inputInfo 함수를 만든다.
         * 접근제어자 String 메서드명(){}
         2. 사용자에게 값을 입력받는다.
         * Scanner sc = new Scanner();
         3.키 나이 성별 이름을 입력받아 문자열로 합친다.
         *더블 키;
         *정수 나이;
         *문자 성별;
         *문자열 이름;
         4. 문자열로 반환한다.
        * return
        */


        }

        public String inputInfo() {


            Scanner sc = new Scanner(System.in);
            System.out.println("당신의 이름을 입력해주세요");
            String name = sc.nextLine(); // nextline <-

            System.out.println("당신의 키를 입력해주세요.");
            double height = sc.nextDouble();

            System.out.println("당신의 나이를 입력해주세요.");
            int age = sc.nextInt();
            sc.nextLine();


            System.out.println("당신의 성별를 입력해주세요.");
            char gender = sc.nextLine().charAt(0);  // 0이라고 인덱스를 지정해야함 그래야 "남(0번째)자(1번째)"

            return "당신의 이름은 " + name + "입니다. \n" + "당신의 나이는 " + age + "세 입니다. \n" + "당신의 성별은 " + gender + " 입니다. \n" + "당신의 키는" + height + "입니다";


        }


    }



