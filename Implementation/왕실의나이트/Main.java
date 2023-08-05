package Implementation.왕실의나이트;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String coord = sc.nextLine();
        int row = coord.charAt(1) - '0';
        int column = coord.charAt(0) - 'a' + 1;
        int[] dx = {2, -2, 2, -2, 1, -1, -1, 1};
        int[] dy = {1, -1, -1, 1, 2, -2, 2, -2};
        int count = 0;

        for (int i = 0; i < dx.length; i++) {
            int nRow = row + dx[i];
            int nCol = column + dy[i];
            if(nRow < 1 || nCol < 1 || nRow > 8 || nCol > 8) continue;
            count++;
        }
        System.out.println(count);

    }
}
