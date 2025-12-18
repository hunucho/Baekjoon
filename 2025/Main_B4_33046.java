import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt=0;
        for(int i=0;i<2;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A=Integer.parseInt(st.nextToken()), B=Integer.parseInt(st.nextToken());
            cnt+=A+B;
        }
        cnt-=2;
        int [] arr = {1,2,3,4};
        System.out.print(arr[cnt%4]);
    }
}