import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int t=0;t<T;t++){
            int d = sc.nextInt(), n=sc.nextInt(), s=sc.nextInt(), p=sc.nextInt();
            int S = n*s, P=d+n*p;
            if(S==P)
                sb.append("does not matter");
            else if(S>P)
                sb.append("parallelize");
            else
                sb.append("do not parallelize");
            sb.append("\n");
        }
        System.out.print(sb);
    }
}