package Greedy.곱하기혹은더하기;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long[] num = new long[s.length()];
        for (int i = 0; i < s.length(); i++) { //배열 안써도됨
            num[i] = s.charAt(i) - '0'; //현재 인덱스의 문자를 숫자로 변경
        }
        long result = num[0];
        for (int i = 1; i < s.length(); i++) {
            if (result <= 1 || num[i] <= 1) { // 1보다 작으면 더하기 수행
                result += num[i];
            } else {
                result *= num[i];
            }
        }
        System.out.println(result);
    }
}

