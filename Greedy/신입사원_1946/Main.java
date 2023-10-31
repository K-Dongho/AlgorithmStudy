package Greedy.신입사원_1946;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCase=Integer.parseInt(bufferedReader.readLine());
        int N;
        for(int i=0; i<testCase; i++){
            N=Integer.parseInt(bufferedReader.readLine());
            String[] temp;

            int arr[][] = new int[N][2];
            int count = 1; // 서류 1등은 무조건 통과

            for (int j = 0; j < N; j++) {
                temp = bufferedReader.readLine().split(" ");
                for (int k = 0; k < 2; k++) {
                    arr[j][k] = Integer.parseInt(temp[k]);
                }
            }
            //오름차순 정렬
            Arrays.sort(arr, new Comparator<int[]>() {
                @Override
                public int compare(int[] arr1, int[] arr2) {
                    return Integer.compare(arr1[0], arr2[0]);
                }
            });

            int top = arr[0][1];
            for (int j = 0; j < N; j++) {
                if(top > arr[j][1]){ //top 보다 더 높은 등수를 가지면 합격
                    top = arr[j][1];
                    count++;
                }
            }
            System.out.println(count);
        }


    }
}
