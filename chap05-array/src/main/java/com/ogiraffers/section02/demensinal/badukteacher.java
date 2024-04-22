package com.ogiraffers.section02.demensinal;

import java.util.Scanner;

public class badukteacher {


    public void badukteacher() {
        String[][] board = new String[19][19]; //바둑판을 만들어야 하니까

        for (int i = 0; i < board.length; i++) { // X축
            for (int j = 0; j < board[i].length; j++) {  // Y축
                board[i][j] = "[ ]";
                System.out.print(board[0][j]);  // FOR 반복문을 왜 써야하는데? FOR문에서 X축,Y축을 보여줘야하니까
            }
            System.out.println(); //
        }
        //바둑판이 잘 만들어져있는지 실행하여 확인하기


        //게임을 하는 로직을 짜준다 (많이 응용해봐야한다.)
        String play = "";
        Scanner scanner = new Scanner(System.in);
        int[] index = new int[2];
        int turn = 0;
        while (!play.equals("exit")){
            System.out.print(" 첫 번째 좌표를 입력해주세요 : ");
            index[0] = scanner.nextInt();
            System.out.println("두 번째 좌표를 입력해주세요 : ");
            index[1] = scanner.nextInt();

            if(board[index[0]][index[1]].equals("[ ]")){
                if(turn % 2 == 0){
                    board[index[0]][index[1]] = "[흑]";
                }else{
                    board[index[0]][index[1]] = "[백]";
                }
            }else{
                System.out.println("같은 위치에 바둑돌을 놓을 수 없습니다.");
                turn += 2;
                continue;
            }

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            turn++;
        }
    }

}






