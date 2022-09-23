package Baekjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        QOne();
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
}
