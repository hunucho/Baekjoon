import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String ans="";
            int [] arr = new int [3];
            for(int i=0;i<3;i++)
                arr[i]=Integer.parseInt(st.nextToken());
            Arrays.sort(arr);
            if(arr[0]+arr[1]<=arr[2])
                ans="invalid!";
            else if(arr[0]==arr[1] && arr[1]==arr[2])
                ans="equilateral";
            else if(arr[0]==arr[1] || arr[1]==arr[2] || arr[2]==arr[0])
                ans="isosceles";
            else
                ans="scalene";
            System.out.printf("Case #%d: %s\n", t+1, ans);
        }
    }
}