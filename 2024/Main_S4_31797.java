import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken()), pos=0;
        int [] H = new int[10001], sorted = new int [M*2];
        for(int i=1;i<=M;i++){
           st = new StringTokenizer(br.readLine());
           H[Integer.parseInt(st.nextToken())]=i;
           H[Integer.parseInt(st.nextToken())]=i;
        }
        for(int i=0;i<=10000;i++)
            if(H[i]>0)
                sorted[pos++]=H[i];
        System.out.println(sorted[(N-1)%(M*2)]);
    }
}

/*
11 3
1 6
3 4
2 5

 */