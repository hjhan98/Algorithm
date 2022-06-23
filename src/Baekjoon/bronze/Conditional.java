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

    /**
     * 2753 윤년
     */
    public static void QThree(){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        if(input % 4 == 0){
            if(input % 400 == 0 )
                input = 1;
            else if(input % 100 == 0)
                input = 0;
            else input = 1;
        }
        else input = 0;
        System.out.println(input);
    }

    /**
     * 14681 사분면 고르기
     */
    public static void QFour(){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int result = 0;
        //1사분면
        if(x>0 && y>0) result = 1;
        else if(x<0 && y>0) result = 2;
        else if(x<0 && y<0) result = 3;
        else result = 4;
        System.out.println(result);
    }

    /**
     * 알람시계
     */
    public static void QFive(){
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt(); // 시간(0 ≤ H ≤ 23)
        int m = scan.nextInt(); // 분( 0 ≤ M ≤ 59)

        if(m-45 >= 0){
            System.out.println(h +" "+ (m-45));
        }
        else{
            h--;
            m =60 - (45-m);
            if(h<0) h = 23;
            System.out.println(h +" "+m);
        }
    }
}
