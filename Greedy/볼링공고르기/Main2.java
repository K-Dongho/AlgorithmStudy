package Greedy.볼링공고르기;

import java.util.*;
/**
 * 효율적인 코드
 * 더 이해 필요
 */
public class Main2 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[11];

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            arr[k] += 1;
        }

        int result = 0;

        // 1부터 m까지의 각 무게에 대하여 처리
        for (int i = 1; i <= m; i++) {
            n -= arr[i]; // 무게가 i인 볼링공의 개수(A가 선택할 수 있는 개수) 제외
            result += arr[i] * n; // B가 선택하는 경우의 수와 곱해주기
        }

        System.out.println(result);
    }
}