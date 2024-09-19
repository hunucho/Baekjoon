import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), M=sc.nextInt();
        int r=N, c=M, minr=50, minc=50, dist=0;
        for(int i=1;i<=N;i++){
            dist=sc.nextInt();
            if(dist<minr){
                r=i;
                minr=dist;
            }
        }
        if(dist<minc){
            c=1;
            minc=dist;
        }
        for(int j=2;j<=M;j++){
            dist=sc.nextInt();
            if(dist<minc){
                c=j;
                minc=dist;
            }
        }
        System.out.println(r+" "+c);
    }
}