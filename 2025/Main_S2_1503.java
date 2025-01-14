import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), M=sc.nextInt();
        boolean [] arr = new boolean [1002];
        for(int i=0;i<M;i++)
            arr[sc.nextInt()]=true;
        int ans=Integer.MAX_VALUE;
        for(int x=1;x<=1000;x++) {
            for (int y=x; y <= 1000; y++) {
                for (int z =y; z <= 1001; z++) {
                    if(arr[x] || arr[y] || arr[z])
                        continue;
                    ans = Math.min(ans, Math.abs(N-(x*y*z)));
                }
            }
        }
        System.out.println(ans);
    }
}