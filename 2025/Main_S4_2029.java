import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char [][] S = new char [10][10];
        int [][] arr = new int [7][7];
        int A = 0, B=0;
        for(int i=0, j=0;i<10;i++)
            S[i] = br.readLine().toCharArray();
        for(int j=1, posY=1;j<10;j+=3, posY+=2) {
            for (int i = 0, posX = 0; i < 10; i += 3, posX += 2) {
                if (S[i][j] == '-')
                    arr[posX][posY] = 1;
                else
                    A++;
                if (S[j][i] == '|')
                    arr[posY][posX] = 1;
                else
                    A++;
            }
        }
        int [] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};
        for(int i=1;i<7;i+=2){
            for(int j=1;j<7;j+=2){
                int sum=0;
                for(int k=0;k<4;k++)
                    sum+=arr[i+dx[k]][j+dy[k]];
                if(sum==4)
                    B++;
            }
        }
        int [] dx2 = {-2, -1, 1, 2, 2, 1, -1, -2}, dy2 = {-1, -2, -2, -1, 1, 2, 2, 1};
        for(int i=2;i<5;i+=2){
            for(int j=2;j<5;j+=2){
                int sum=0;
                for(int k=0;k<8;k++)
                    sum+=arr[i+dx2[k]][j+dy2[k]];
                if(sum==8)
                    B++;
            }
        }
        int sum=0;
        for(int i=0;i<7;i++){
            sum+=arr[0][i]+arr[i][0]+arr[6][i] + arr[i][6];
        }
        if(sum==12)
            B++;
        System.out.println(A+" "+B);
    }
}