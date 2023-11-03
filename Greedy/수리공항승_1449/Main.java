package Greedy.수리공항승_1449;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int L = sc.nextInt();
        int count = 0;
        int[] pipe = new int[n];

        for (int i = 0; i <n; i++) {
            pipe[i] = sc.nextInt();
        }
        Arrays.sort(pipe);
        int temp = pipe[0];
        for (int i = 0; i < n; i++) {
            if(temp + L <= pipe[i]){
                count++;
                temp = pipe[i];
            }

        }
        if(temp + L >= pipe[n-1]) count++;
        System.out.println(count);
    }
}
