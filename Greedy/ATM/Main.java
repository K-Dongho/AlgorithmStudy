package Greedy.ATM;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] m = new int[n];
        int result = 0;

        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }
        Arrays.sort(m);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                result += m[j];
            }
        }
        System.out.println(result);
    }
}
