package Greedy.모험가길드;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x = new int[n];
        int group = 0;
        int member = 0;
        for (int i = 0; i < n; i++) {
            x[i]= sc.nextInt();
        }
        Arrays.sort(x);

        for (int i = 0; i < n; i++) {
            member++;   //멤버추가
            if (member >= x[i]) {// 현재 멤버의 공포도 비교 (현 그룹의 멤버수 >= 현재멤버의 공포도)
                group++; //그룹추가
                member=0;//새 그룹을 위한 멤버수 초기화
            }
        }
        System.out.println(group);

    }
}
