import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [][] arr = new int [4][5];
        for(int i=0;i<4;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<5;j++)
                arr[i][j]=Integer.parseInt(st.nextToken());
        }
        double c1 = F(arr[0][0], arr[0][1], arr[0][2], arr[0][3], arr[0][4]);
        double p1 = F(arr[1][0], arr[1][1], arr[1][2], arr[1][3], arr[1][4]);
        double c2 = F(arr[0][0]-arr[2][0]+arr[3][0], arr[0][1]-arr[2][1]+arr[3][1], arr[0][2]-arr[2][2]+arr[3][2], arr[0][3]-arr[2][3]+arr[3][3], arr[0][4]-arr[2][4]+arr[3][4]);
        double p2 = F(arr[1][0]-arr[3][0]+arr[2][0], arr[1][1]-arr[3][1]+arr[2][1], arr[1][2]-arr[3][2]+arr[2][2], arr[1][3]-arr[3][3]+arr[2][3], arr[1][4]-arr[3][4]+arr[2][4]);
        System.out.println(c1==c2?0:c1>c2?"-":"+");
        System.out.println(p1==p2?0:p1>p2?"-":"+");

    }

    static double F(double a, double b, double c, double d, double e){
        return a*(1+(b)/100)*(100*(100-Math.min(c, 100)) + Math.min(c, 100) * d) *(100+e);
    }
}
