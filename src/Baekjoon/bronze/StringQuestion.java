package Baekjoon.bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringQuestion {
    public static void main(String[] args) {
        QThree();
    }

    /**
     * 11654, 아스키 코드
     */
    public static void QOne(){
        Scanner scan = new Scanner(System.in);
        int num = scan.next().charAt(0);
        System.out.println(num);
    }

    /**
     * 11720, 숫자들의 합
     */
    public static void QTwo(){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int cnt = scan.nextInt();
        String numbers = scan.next();
        for(int i = 0; i < cnt; i++){
            /**이렇게 했을 때 안되는 이유 : charAt()은 해당 문자의 아스키 코드값을 반환하므로 반드시 -48 또는 '0'을 해줘야 우리가 입력한 값 그대로를 반환한다*/
//            sum += numbers.charAt(i);
            sum += numbers.charAt(i)-48;
        }
        System.out.println(sum);
    }

    /**
     * 10809, 알파벳 찾기
     * 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력
     */
    public static void QThree() {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int cnt = 0;
        int[] arr = new int[26];    // a~ z : 26자

        //초기값 셋팅
        for(int i = 0; i<arr.length; i++){
            arr[i] = -1;
        }

        for(int i = 0; i<s.length(); i++){
            int ss = s.charAt(i)-'a';   // ss가 곧 a-z 배열에 해당하는 인덱스
            if(arr[ss] == -1){
                arr[ss] = i;
            }
        }
        for (int var:arr) {
            System.out.print(var+" ");
        }
    }
}
