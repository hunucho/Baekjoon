import java.io.*;
import java.util.*;
public class Main {
    static long [] A;
    static int n, m;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
        A = new long[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
            A[i]=Long.parseLong(st.nextToken());
        Arrays.sort(A);
        for(int i=0;i<m;i++){
            st=new StringTokenizer(br.readLine());
            int sw = Integer.parseInt(st.nextToken()), ans=0;
            switch (sw){
                case 1:
                    ans=n-getLoc1(Long.parseLong(st.nextToken()), 0, n);
                    break;
                case 2:
                    ans=n-getLoc2(Long.parseLong(st.nextToken()), 0, n);
                    break;
                case 3:
                    int ans1=getLoc3(Long.parseLong(st.nextToken()), 0, n), ans2=getLoc4(Long.parseLong(st.nextToken()), 0, n);
                    ans=ans2-ans1;
                    break;
            }
            sb.append(ans+"\n");
        }
        System.out.println(sb);
    }
    public static int getLoc1 (long k, int s, int e) {
        if(s>=e)
            return e;
        int m=(s+e)/2;
        if(A[m]<k)
            s=m+1;
        else
            e=m;
        return getLoc1(k, s, e);
    }
    public static int getLoc2 (long k, int s, int e) {
        if(s>=e)
            return e;
        int m=(s+e)/2;
        if(A[m]>k)
            e=m;
        else
            s=m+1;
        return getLoc2(k, s, e);
    }
    public static int getLoc3 (long i, int s, int e) {
        if(s>=e)
            return e;
        int m=(s+e)/2;
        if(A[m]<i)
            s=m+1;
        else
            e=m;
        return getLoc3(i,s,e);
    }

    public static int getLoc4 (long j, int s, int e) {
        int m=(s+e)/2;
        if(s>=e)
            return e;
        if(A[m]>j)
            e=m;
        else
            s=m+1;
        return getLoc4(j,s,e);
    }
}

//9 2
//1 2 2 5 5 5 5 15 20
//3 1 5
//3 2 5
