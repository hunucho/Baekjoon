import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken()), m=Integer.parseInt(st.nextToken());
            int [] win = new int [n+1], lose = new int [n+1];
            for(int i=0;i<m;i++){
                st = new StringTokenizer(br.readLine());
                int a=Integer.parseInt(st.nextToken()), b=Integer.parseInt(st.nextToken());
                int p=Integer.parseInt(st.nextToken()), q=Integer.parseInt(st.nextToken());
                win[a]+=p;
                win[b]+=q;
                lose[a]+=q;
                lose[b]+=p;
            }
            int max=0, min=9999;
            for(int i=1;i<=n;i++){
                if(win[i]==0 && lose[i]==0)
                    min=0;
                else {
                    int tmp = (int) ((Math.pow(win[i], 2) / (Math.pow(win[i], 2) + Math.pow(lose[i], 2))) * 1000);
                    max = Math.max(max, tmp);
                    min = Math.min(min, tmp);
                }
            }
            System.out.println(max+"\n"+min);
        }
    }
}