import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), M=sc.nextInt(), K=sc.nextInt();
        if(K<N+M-1)
            System.out.print("NO");
        else {
            System.out.println("YES");
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<N;i++) {
                for (int j = 1; j <= M; j++)
                    sb.append(i+j).append(" ");
                sb.append("\n");
            }
            System.out.print(sb);
        }
    }
}