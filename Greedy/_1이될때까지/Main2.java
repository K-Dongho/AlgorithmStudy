package Greedy._1이될때까지;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        //n이 k의 배수가 되도록 한번에 빼기
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;

        while (true) {
            int target = (n / k) * k; //k로 나누어 떨어지는 가장 가까운수
            count += (n - target);//한번에 빼기
            n = target;
            if (n < k) break;
            count++;
            n /= k;//k로 나누기
        }
        count += (n - 1);
        System.out.println(count);
    }
}
