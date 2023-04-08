package Greedy.거스름돈;

public class Main {
    public static void main(String[] args) {
        int N = 1260;
        int[] coin = {500, 100, 50, 10};
        int count =0;

        for(int i=0; i<4; i++){
            count += N /coin[i];
            N %= coin[i];
        }
        System.out.println(count);
    }
}
