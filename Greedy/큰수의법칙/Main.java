package Greedy.큰수의법칙;

import java.util.*;

    /**
     * 큰 수의 법칙 단순하게 반복하는 풀이
     */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int result = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }
        Collections.sort(arrayList, Collections.reverseOrder());//입력받은 수 내림차순 정렬
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                if (i >= m) break; // 수를 m번 더했으면 탈출
                result += arrayList.get(0); //가장큰수를 k번 더하기
                i++;
            }
            if (i >= m) break; // 수를 m번 더했으면 탈출
            result += arrayList.get(1); //두번째로 큰수 한번 더하기
        }
        System.out.println(result);
    }
}
