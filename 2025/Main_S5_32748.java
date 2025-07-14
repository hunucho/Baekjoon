import java.io.*;
import java.util.*;

public class Main {
    static int [] f, g;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        f = new int [10];
        g = new int [10];
        for(int i=0;i<10;i++) {
            f[i] = sc.nextInt();
            g[f[i]]=i;
        }
        int A=get(sc.nextInt()), B=get(sc.nextInt());
        System.out.print(getF(A+B));
    }
    static int get(int S){
        int ret = 0, i=0;
        while(S>0){
            int mod = S%10;
            ret+=g[mod]* Math.pow(10, i++);
            S/=10;
        }
        return ret;
    }
    static int getF(int S){
        int ret = 0, i=0;
        while(S>0){
            int mod = S%10;
            ret+=f[mod]* Math.pow(10, i++);
            S/=10;
        }
        return ret;
    }
}