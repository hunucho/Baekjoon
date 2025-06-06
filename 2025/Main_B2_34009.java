import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int [] A = new int [N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)
            A[i]=Integer.parseInt(st.nextToken());
        Arrays.sort(A);
        int s=0, e=N-1;
        long Alice=0, Bob=0;
        String ans="Alice";
        for(int i=0;i<N;i++){
            if((N-i)%2==0)
                Alice+=A[e--];
            else
                Bob+=A[s++];
            if(Bob>=Alice)
                ans="Bob";
        }
        System.out.print(ans);
    }
}