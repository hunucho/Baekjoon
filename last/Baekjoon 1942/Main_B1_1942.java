import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int t=0;t<3;t++){
            int ans=0;
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            StringTokenizer st2 = new StringTokenizer(st1.nextToken(), ":");
            int [] t1 = new int[3], t2 = new int [3];
            for(int i=0;i<3;i++)
                t1[i]=Integer.parseInt(st2.nextToken());
            StringTokenizer st3 = new StringTokenizer(st1.nextToken(), ":");
            for(int i=0;i<3;i++)
                t2[i]=Integer.parseInt(st3.nextToken());
            int ss1 = t1[0]*60*60 + t1[1]*60 + t1[2], ss2 = t2[0]*60*60 + t2[1]*60 + t2[2];
            if(ss1>ss2) {
                for (int i = ss1; i < 24*60*60; i++)
                    if (toTime(i) % 3 == 0)
                        ans++;
                for (int i=0;i<=ss2;i++)
                    if(toTime(i)%3==0)
                        ans++;
            } else {
                for(int i=ss1; i<=ss2;i++)
                    if(toTime(i)%3==0)
                        ans++;
            }
            System.out.println(ans);
        }
    }
    public static int toTime(int a){
        int h=a/60/60;
        int m=(a-h*60*60)/60;
        int s=a-h*60*60-m*60;
        int ret = h/10+h%10+m/10+m%10+s/10+s%10;
        return ret;
    }
}