package Baekjoon.bronze;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        QTwo();
    }

    /**
     * 1330 두 수 비교하기
     */
    public static void QOne(){
        int a,b;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        if(a>b) System.out.println(">");
        else if(a<b) System.out.println("<");
        else System.out.println("==");
    }

    /**
     * 9498 시험 성적
     */
    public static void QTwo(){
        int score = 0;
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();
        if(score >=90 && score <= 100) System.out.println("A");
        else if(score >= 80 && score <90) System.out.println("B");
        else if(score >= 70 && score <80) System.out.println("C");
        else if(score >= 60 && score <70) System.out.println("D");
        else System.out.println("F");
    }
}
