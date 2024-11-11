import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());
        Integer [] A = new Integer[n], B=new Integer[m];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            A[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(A, Collections.reverseOrder());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++)
            B[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(B, Collections.reverseOrder());

        int ans=0, curA=1, curB=0, idxA=0, idxB=0;

        while(idxA<n && idxB<m){
            //A->B
            if(idxA<n && curA>0){
                curB+=A[idxA++];
                curA--;
            }
            //B->A
            while (idxB<m && curB>0) {
                curA+=B[idxB++];
                curB--;
            }
            ans= Math.max(ans, curA);
        }
        System.out.println(ans);
    }
}