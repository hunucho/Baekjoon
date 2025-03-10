import java.util.*;
import java.io.*;

public class Main {
    static int [][] arr;
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int player=sc.nextInt(), ans=0;
        arr = new int [4][4];
        for(int i=0;i<9;i++){
            arr[sc.nextInt()][sc.nextInt()]=player;
            if (isDone()) {
                ans=player;
                break;
            }
            player=3-player;
        }
        System.out.print(ans);
    }
    public static boolean isDone(){
        for(int i=1;i<=3;i++)
            if(arr[i][1]!=0 && arr[i][1]==arr[i][2] && arr[i][2]==arr[i][3])
                return true;
        for(int j=1;j<=3;j++)
            if(arr[1][j]!=0 && arr[1][j]==arr[2][j] && arr[2][j]==arr[3][j])
                return true;
        if(arr[1][1]!=0 && arr[1][1]==arr[2][2] && arr[2][2]==arr[3][3])
            return true;
        if(arr[3][1]!=0 && arr[3][1]==arr[2][2] && arr[2][2]==arr[1][3])
            return true;
        return false;
    }
}