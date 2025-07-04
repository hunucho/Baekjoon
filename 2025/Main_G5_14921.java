import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine()), B=0, b=Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] A = new int [N];
        for(int i=0;i<N;i++)
            A[i] = Integer.parseInt(st.nextToken());
        int l=0, r=N-1;
        while(l<N && r>=0 && l!=r){
            int tmp =A[l]+A[r];
            if(Math.abs(tmp)<b) {
                B = tmp;
                b = Math.abs(tmp);
            }
            if(tmp<0)
                l++;
            else
                r--;
        }
        System.out.print(B);
    }
}