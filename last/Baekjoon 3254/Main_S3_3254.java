import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

class Main {
    static HashMap<Integer, Integer> height;
    static int [][] board;
    // s=1, m=2;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        board = new int[7][8];
        height = new HashMap<>();
        for(int i=1;i<=7;i++)
            height.put(i,1);
        String ans = "ss";
        for(int i=1;i<=21;i++){
            int S=sc.nextInt(), M=sc.nextInt();
            board[height.get(S)][S]=1;
            height.put(S,height.get(S)+1);
            board[height.get(M)][M]=2;
            height.put(M,height.get(M)+1);
            int ret = check();
            if(ret!=0){
                ans = (ret==1?"sk ":"ji ")+i;
                break;
            }
        }
        System.out.println(ans);
    }

    // S : true, J : false
    public static int check(){
        int [] horx = {0, 0, 0, 0}, hory = {0, 1, 2, 3};
        int [] verx = {0, 1, 2, 3}, very = {0, 0, 0, 0};
        int [] di1x = {0, 1, 2, 3}, di1y = {0, 1, 2, 3};
        int [] di2x = {0, -1, -2, -3}, di2y = {0, 1, 2, 3};
        int ret = 0;
        for(int i=1;i<=6;i++){
            for(int j=1;j<=4;j++){
                if(board[i][j]!=0) {
                    int cnt=0, last = 0;
                    for (int k = 0; k < 4; k++) {
                        int nx = i + horx[k], ny = j + hory[k];
                        if (last == board[nx][ny]) {
                            cnt++;
                        } else {
                            last = board[nx][ny];
                            cnt = 1;
                        }
                        if (cnt == 4)
                            return last;
                    }
                }
            }
        }
        for(int i=1;i<=3;i++){
            for(int j=1;j<=6;j++){
                if(board[i][j]!=0) {
                    int cnt=0, last = 0;
                    for (int k = 0; k < 4; k++) {
                        int nx = i + verx[k], ny = j + very[k];
                        if (last == board[nx][ny]) {
                            cnt++;
                        } else {
                            last = board[nx][ny];
                            cnt = 1;
                        }
                        if (cnt == 4)
                            return last;
                    }
                }
            }
        }
        for(int i=1;i<=3;i++){
            for(int j=1;j<=4;j++){
                if(board[i][j]!=0) {
                    int cnt=0, last = 0;
                    for (int k = 0; k < 4; k++) {
                        int nx = i + di1x[k], ny = j + di1y[k];
                        if (last == board[nx][ny]) {
                            cnt++;
                        } else {
                            last = board[nx][ny];
                            cnt = 1;
                        }
                        if (cnt == 4)
                            return last;
                    }
                }
            }
        }
        for(int i=4;i<=6;i++){
            for(int j=1;j<=4;j++){
                if(board[i][j]!=0) {
                    int cnt=0, last = 0;
                    for (int k = 0; k < 4; k++) {
                        int nx = i + di2x[k], ny = j + di2y[k];
                        if (last == board[nx][ny]) {
                            cnt++;
                        } else {
                            last = board[nx][ny];
                            cnt = 1;
                        }
                        if (cnt == 4)
                            return last;
                    }
                }
            }
        }
        return 0;
    }
}