package Greedy.회의실배정;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];
        int[] sortStart = new int[n];
        int[] sortEnd = new int[n];
        int count = 0;
        int time = 0;

        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }

        Integer[] index = new Integer[end.length];
        for (int i = 0; i < end.length; i++) {
            index[i] = i;
        }
        Arrays.sort(index, Comparator.comparingInt((Integer i) -> end[i])
                                    .thenComparingInt(i ->start[i]));

        for (int i = 0; i < index.length; i++) {
            sortStart[i] = start[index[i]];
            sortEnd[i] = end[index[i]];
        }
        for (int i = 0; i < n; i++) {
            if (sortStart[i] >= time) {
                time = sortEnd[i];
                count++;
            }
        }
        System.out.println(count);
    }

}

