package Greedy.큰수의법칙;

import java.util.*;

/**
 * 큰수의 법칙 수열 이용한 풀이
 * 반복되는 수열의 길이 = k+1
 * m / (k+1) = 수열이 반복되는 횟수
 * (m / (k+1)) * k = 가장 큰 수가 등장하는 횟수
 * 나누어 떨어지지 않는 경우도 고려 해야함 m % (k + 1)
 * m - 가장 큰 수가 등장하는 횟수 = 두 번째로 큰 수 등장 횟수
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int result = 0;
        ArrayList<Integer> arrayList = arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }
        Collections.sort(arrayList, Collections.reverseOrder());

        int count = (m / (k + 1)) * k; // 가장 큰 수가 등장하는 횟수
        count += m % (k + 1); // 나누어 떨어지지 않는 경우 고려

        result += count * arrayList.get(0); //가장 큰 수 더하기
        result += (m - count) * arrayList.get(1);//두 번째로 큰 수 더하기
        System.out.println(result);
    }

}
