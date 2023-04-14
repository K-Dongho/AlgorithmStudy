package Greedy.만들수없는금액;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] coin = new int[n];
        for (int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
        }
        Arrays.sort(coin);
        int result = 1;
        for (int i = 0; i < n; i++) {
            if(result < coin[i]) break;
            result += coin[i];
        }

        System.out.println(result);
    }
}