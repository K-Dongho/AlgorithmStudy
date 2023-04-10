package Greedy._1이될때까지;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;

        while (n != 1) { //1이 될때까지 1을 빼거나 n을 k로 나눔
            if (n % k != 0) {
                n--;
                count++;
            } else {
                n /= k;
                count++;
            }
        }
        System.out.println(count);
    }
}
