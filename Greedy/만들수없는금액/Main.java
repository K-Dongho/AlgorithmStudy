package Greedy.만들수없는금액;

import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> coin = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            coin.add(sc.nextInt());
        }
        Collections.sort(coin, Collections.reverseOrder());
        int result = 1;
        int cnt = 1;

        while(true){
            for (int i = 0; i < n; i++) {
                if((result - coin.get(i)) >= 0) result -= coin.get(i);
            }
            if(result > 0) break;
            else {
                cnt++;
                result = cnt;
            }
        }
            System.out.println(cnt);
    }
}
