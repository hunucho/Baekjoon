import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        int ans=0;
        int S=420, E=1140;
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringTokenizer stTime = new StringTokenizer(st.nextToken(),":");
            int HH=Integer.parseInt(stTime.nextToken()), MM=Integer.parseInt(stTime.nextToken());
            int DD=Integer.parseInt(st.nextToken());
            for(int t=0;t<DD;t++){
                int curTime = (HH*60+MM+t)%1440;
                if(S<=curTime && curTime<E)
                    ans+=10;
                else
                    ans+=5;
            }
        }
        System.out.println(ans);
    }
}