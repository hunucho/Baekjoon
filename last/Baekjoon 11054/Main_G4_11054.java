import java.io.*;
        import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine()), ans=0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] A = new int [N];
        int [] incDp = new int [N], decDp = new int [N];
        for(int i=0;i<N;i++)
            A[i] = Integer.parseInt(st.nextToken());
        for(int i=0;i<N;i++){
            incDp[i]=1;
            for(int j=0;j<i;j++)
                if(A[i]>A[j] && incDp[j]+1>incDp[i])
                    incDp[i]=incDp[j]+1;

            int max = 0;
            for(int j=i;j<N;j++){
                decDp[j]=0;
                for(int k=i;k<j;k++)
                    if(A[k]>A[j] && decDp[k]+1>decDp[j])
                        decDp[j]=decDp[k]+1;
                max = Math.max(max, decDp[j]);
            }
            ans = Math.max(ans, incDp[i]+max);
//            for(int j=0;j<N;j++)
//                System.out.print(incDp[j]+" ");
//            System.out.println();
            for(int j=0;j<N;j++) {
//                System.out.print(decDp[j] + " ");
                decDp[j] = 0;
            }
//            System.out.println();
//            System.out.println();
        }
        System.out.println(ans);

    }
}

//10
//1 5 2 1 4 3 4 5 2 1