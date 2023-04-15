package Greedy.볼링공고르기;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] k = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            k[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(k[i] != k[j]) count++;
            }
        }
        System.out.println(count);
    }
}
