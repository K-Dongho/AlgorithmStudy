package Greedy.주식_11501;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        int n;
        int max;
        for (int i = 0; i < testCase; i++) {
            n = sc.nextInt();
            int [] stock = new int[n];
            long result = 0;
            for (int j = 0; j < n; j++) {
                stock[j] = sc.nextInt();
            }
            max = stock[n-1];
            for (int j = n-2; j >= 0; j--) {
                if(stock[j] < max){ //최대값 보다 작으면 주식 팔기
                    result += max - stock[j];
                }
                if(stock[j] >= max){ //크면 최대값 갱신
                    max = stock[j];
                }
            }
            System.out.println(result);
        }
    }
}
