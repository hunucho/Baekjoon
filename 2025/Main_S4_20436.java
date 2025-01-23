import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char [][] L = new char[3][], R = new char[3][];
        L[0]="qwert".toCharArray();
        L[1]="asdfg".toCharArray();
        L[2]="zxcv".toCharArray();
        R[0]="1yuiop".toCharArray();
        R[1]="1hjkl".toCharArray();
        R[2]="bnm".toCharArray();

        char SL = sc.next().charAt(0), SR = sc.next().charAt(0);
        int lx=0, ly=0, rx=0, ry=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<L[i].length;j++)
                if(L[i][j]==SL){
                    lx=i;
                    ly=j;
                }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<R[i].length;j++)
                if(R[i][j]==SR){
                    rx=i;
                    ry=j;
                }
        }
        String S = sc.next();
        int ans=S.length();
        for(char ch : S.toCharArray()){
            for(int i=0;i<3;i++){
                for(int j=0;j<L[i].length;j++)
                    if(L[i][j]==ch){
                        ans+=getDist(lx, ly, i, j);
                        lx=i;
                        ly=j;
                    }
            }
            for(int i=0;i<3;i++){
                for(int j=0;j<R[i].length;j++)
                    if(R[i][j]==ch){
                        ans+=getDist(rx, ry, i, j);
                        rx=i;
                        ry=j;
                    }
            }
        }
        System.out.println(ans);
    }

    public static int getDist(int x1, int y1, int x2, int y2){
        return Math.abs(x1-x2)+Math.abs(y1-y2);
    }
}