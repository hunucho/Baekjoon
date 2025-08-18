import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), M=sc.nextInt();
        int a=sc.nextInt(), b=sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<a;i++)
            sb.append("S".repeat(M)).append("\n");

        sb.append("E".repeat(b+1));
        sb.append("W".repeat(M-b-1)).append("\n");

        for(int i=a+1;i<N;i++)
            sb.append("N".repeat(M)).append("\n");
        System.out.print(sb);
    }
}