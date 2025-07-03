import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] A = new int [N];
        long even=0, odd=0, ans=0;
        for(int i=0;i<N;i++) {
            A[i] = Integer.parseInt(st.nextToken());
            if(i%2==0)
                even+=A[i];
            else
                odd+=A[i];
        }
        if(N==3){
            if(A[1]-A[0]-A[2]>=0)
                ans = A[1]-A[0]-A[2];
            else
                ans=-1;
        } else {
            ans= Math.abs(even-odd);
        }
        System.out.print(ans);
    }
}