package com.ogirappers.section01.list.run;

import com.ogirappers.section01.list.comparator.AscendingPrice;
import com.ogirappers.section01.list.dto.BookDTO;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application02 {

    public static void main(String[] args) {
        List<BookDTO> bookDTOList = new ArrayList<>();
        bookDTOList.add(new BookDTO(3, "홍길동전", "허균", 50000));
        bookDTOList.add(new BookDTO(4, "목민심서", "정약용", 30000));
        bookDTOList.add(new BookDTO(5, "동의보감", "허준", 40000));
        bookDTOList.add(new BookDTO(6, "삼국사기", "김부식", 46000));
        bookDTOList.add(new BookDTO(7, "삼국유사", "일연", 58000));

        for (BookDTO bookDTO : bookDTOList) {
            System.out.println(bookDTO);
        }

        List testlist = new ArrayList();
        testlist.add(1);
        testlist.add("2");
        testlist.add('3');
        for (Object test : testlist){
            System.out.println(test.toString());
        }
        //제네릭의 타입 제한에 의해 comparable 타입을 가지고 있는 경우에만 sort가 사용가능하다.
//        Collections.sort(bookDTOList);
        bookDTOList.sort(new AscendingPrice());

        System.out.println("가격 오름차순 정렬");
        for (BookDTO book : bookDTOList) {
            System.out.println(book);
        }



    }
}
