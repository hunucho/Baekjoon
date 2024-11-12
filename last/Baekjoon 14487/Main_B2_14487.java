import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max =0, ans=0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            int tmp = Integer.parseInt(st.nextToken());
            max=Math.max(max, tmp);
            ans+=tmp;
        }
        System.out.println(ans-max);
    }
}