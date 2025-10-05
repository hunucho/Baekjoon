import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int [][] path = new int [N][2];
        int x=0, y=0;
        for(int i=0;i<N;i++) {
            path[i][0]=sc.nextInt();
            path[i][1]=sc.nextInt();
            x+=path[i][0];
            y+=path[i][1];
        }
        System.out.println(x+" "+y);
        double dist = Float.MAX_VALUE;
        for(int i=0;i<N;i++){
            double X = Math.pow(x-path[i][0], 2), Y=Math.pow(y-path[i][1], 2);
            dist = Math.min(dist, Math.pow(X+Y, 0.5));
        }
        System.out.printf("%.2f",dist);
    }
}