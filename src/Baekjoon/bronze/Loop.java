package Baekjoon.bronze;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Loop {
    public static void main(String[] args) {
        QThree();
    }

    /**
     * 2739 구구단
     */
    public static void QOne(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 1; i<10; i++){
            System.out.println( n+" * "+i +" = "+ n*i);
        }
    }

    /**
     * 10950 A+B-3 : 각 테스트 케이스마다 A+B를 출력한다.
     */
    public static void QTwo(){
        Scanner scan = new Scanner(System.in);
        int count =0;   //몇 번 받을건지
        int a, b = 0;
        count = scan.nextInt();
        for(int i = 0; i < count; i++){
            a = scan.nextInt();
            b = scan.nextInt();

            System.out.println(a+b);
        }
    }

    /**
     * 8393 합 : n 입력받고, n~1 까지의 합 구하기
     */
    public static void QThree(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        while (n >= 1){
            sum += n;
            n--;
        }
        System.out.println(sum);
    }

    /**
     * 115552 빠른 A+B
     */
    public static void QFour() throws IOException {
        // 버퍼 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 버퍼 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        // 문자열 분리를 위해 StringTokenizer 사용
        StringTokenizer st;
         for(int i=0; i<n; i++){
             // 공벡으로 두 문자 분리
             st = new StringTokenizer(br.readLine(), " ");
             // 토큰(분리되어있는 문자열)을 반환하여  Int형으로 변환하여 저장
             bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+"\n");
        }
         br.close();

         bw.flush();    // 버퍼 비우고
         bw.close();    // 닫기
    }

}
