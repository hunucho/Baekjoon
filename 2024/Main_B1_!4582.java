import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[9], brr = new int [9];
        StringTokenizer st1 = new StringTokenizer(br.readLine()), st2 = new StringTokenizer(br.readLine());
        int a=0, b=0;
        String ans="No";
        for(int i=0;i<9;i++){
            a+=Integer.parseInt(st1.nextToken());
            if(a>b)
                ans="Yes";
            b+=Integer.parseInt(st2.nextToken());
        }
        System.out.println(ans);
    }
}