package Implementation.게임개발;

import java.util.Scanner;

public class Main {
    public static int n, m, x, y, direction;


    // 방문한 위치를 저장하기 위한 맵
    public static int[][] d = new int[50][50];
    // 전체 맵
    public static int[][] arr = new int[50][50];

    /*
    북 : 0
    동 : 1
    남 : 2
    서 : 3
     */
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};

    public static void turnLeft() {
        direction -= 1;
        if(direction == -1) direction = 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        x = sc.nextInt();
        y = sc.nextInt();
        direction = sc.nextInt();
        d[x][y] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int count = 1;
        int turn = 0;
        while (true) {
            turnLeft();
            int nx = x + dx[direction];
            int ny = y + dy[direction];
            if (d[nx][ny] == 0 && arr[nx][ny] == 0) { //가보지 않은 칸이 존재하는 경우 앞으로 이동
                d[nx][ny] =1;
                x = nx;
                y = ny;
                turn = 0;
                count ++;
            }else turn++; //존재하지 않으면 회전
            if (turn == 4){ //4방향 모두 막혀있으면
                nx = x - dx[direction];
                ny = y - dy[direction];
                if (arr[nx][ny] == 0) {  //뒤로한칸 갈수있으면 이동
                    x = nx;
                    y = ny;
                }else break;//못가면 종료
                turn = 0;
            }
        }
        System.out.println(count);

    }
}
