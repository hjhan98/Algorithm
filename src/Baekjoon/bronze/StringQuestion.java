package Baekjoon.bronze;

import java.util.Scanner;

public class StringQuestion {
    public static void main(String[] args) {
        QOne();
    }

    /**
     * 11654, 아스키 코드
     */
    public static void QOne(){
        // 1. String으로 입력받고 charAt()으로 짜른다(문자열을 잘라 문자로 변환)
        // 2. int 타입 변수에 저장함으로써 문자에 대응되는값, 아스키 코드를 반환
        Scanner scan = new Scanner(System.in);
        int str = scan.next().charAt(0);
        System.out.println(str);
    }

}
