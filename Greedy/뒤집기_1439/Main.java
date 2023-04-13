package Greedy.뒤집기_1439;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count0 = 0; //0으로 바꾸는경우
        int count1 = 0; //1로 바꾸는경우

        if(str.charAt(0) == '0') count1++;
        else count0++;

        for (int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) != str.charAt(i+1)){
                if(str.charAt(i+1) == '0') count1++;
                else count0++;
            }
        }
        System.out.println(Math.min(count0, count1));
    }
}
