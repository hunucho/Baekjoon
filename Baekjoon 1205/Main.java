import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken()), t=Integer.parseInt(st.nextToken()), p=Integer.parseInt(st.nextToken()), ans=-1;
        int [] arr = new int[n], rank = new int[p];
        Arrays.fill(rank,-1);
        if(n>0) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        for(int i=0;i<Math.min(n,p);i++)
            rank[i]=arr[n-i-1];
        if(rank[p-1]>=t)
            ans=-1;
        else {
            int ord=1, same=0;
            for (int i = 0; i < p; i++) {
                if (rank[i] > t)
                    ord++;
                else if (rank[i] == t)
                    same++;
                else
                    ans=ord;
            }
        }
        System.out.println(ans);
    }
}
