package Greedy.설탕배달;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int f = n % 5;
        int count = 0;
        int tmp = 0;
        if (n % 5 == 0) {
            count = n / 5;
        }
        else{
        do {
            n -= 3;
            count++;
        } while (n % 5 != 0);
        count = count + n / 5;
        }

        if (n < 0) {
            System.out.println(-1);
        }else{
            System.out.println(count);
        }
    }
}
