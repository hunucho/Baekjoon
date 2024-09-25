import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] a = new int [N];
        for(int i=0;i<N;i++)
            a[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(a);
        int P=0, S=0;
        for(int i=0;i<N/2;i++)
            P+=a[i];
        for(int i=N/2;i<N;i++)
            S+=a[i];
        System.out.println(P+" "+S);
    }
}