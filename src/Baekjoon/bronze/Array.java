package Baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class Array {
    public static void main(String[] args) throws IOException {
        QFour();
    }

    /**
     * 최소, 최대 (10818)
     * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오
     */
    public static void QOne(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0]+ " "+arr[n-1]);
    }

    /**
     * 평균 (1546)
     * 세준아 그 생각할 시간에 공부나 해..
     */
    public static void QTwo(){
        Scanner scan = new Scanner(System.in);
        int testCnt = scan.nextInt();
        double arr[] = new double[testCnt];
        double sum = 0;

        for(int i = 0; i <arr.length; i++){
            arr[i] = scan.nextDouble();
        }
        scan.close();
        // 최댓값 구하기
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++){
            sum += ((arr[i]/arr[arr.length-1]) *100);
        }

        System.out.println(sum/arr.length);

    }


    /**
     * OX 퀴즈(8958)
     * "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
     * 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
     * "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
     */
    public static void QFour() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < cnt; i++){
            String input = br.readLine();
            int score = 0;
            int add = 0;
            for(int j = 0; j < input.length(); j++){
                if(input.charAt(j) == 'O'){
                    add++;
                    score += add;
                }else add = 0;
            }
            System.out.println(score);
        }
    }
}
