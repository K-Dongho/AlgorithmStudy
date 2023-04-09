package Greedy.숫자카드게임;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {
            int min = 10001;
            for (int j = 0; j < m; j++) {
                int data = sc.nextInt();
                min = Math.min(min, data); //현재 줄에서 가장 작은값
            }
            result = Math.max(result, min); //가장 작은값 중 가장 큰값
        }
        System.out.println(result);
    }
}
