import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<5*N;i++){
            for(int j=0;j<5;j++){
                if((i/N)%2==1 || j==0 || j==4)
                    sb.append("@".repeat(N));
                else
                    sb.append(" ".repeat(N));
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}