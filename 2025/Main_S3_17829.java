import java.io.*;
import java.util.*;

public class Main {
    static int [][] arr;
    public static void main(String[] args) throws  Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        arr = new int [N][N];
        for(int i=0;i<N;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++)
                arr[i][j]=Integer.parseInt(st.nextToken());
        }
        while(N>1){
            int [][] brr = new int [N/2][N/2];
            for(int i=0, r=0;i<N;i+=2, r++){
                for(int j=0, c=0;j<N;j+=2, c++){
                    brr[r][c]=getSecond(i, j);
                }
            }
            N/=2;
            arr = brr;
        }
        System.out.print(arr[0][0]);
    }
    static int getSecond(int r, int c){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                pq.add(arr[r+i][c+j]);
        pq.poll();
        return pq.peek();
    }
}
