import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double Rh=Integer.parseInt(st.nextToken()), Rv=Integer.parseInt(st.nextToken()), Sh=Integer.parseInt(st.nextToken()), Sv=Integer.parseInt(st.nextToken());
        int n=Integer.parseInt(br.readLine()), ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            int rh=Integer.parseInt(st.nextToken()), rv=Integer.parseInt(st.nextToken()), sh=Integer.parseInt(st.nextToken()), sv=Integer.parseInt(st.nextToken()), p=Integer.parseInt(st.nextToken());
            ans= (int)Math.min(ans, Math.max(Math.ceil(Rh/rh), Math.ceil(Sh/sh)) * Math.max(Math.ceil(Rv/rv), Math.ceil(Sv/sv))* p);
            ans= (int)Math.min(ans, Math.max(Math.ceil(Rh/rv), Math.ceil(Sh/sv)) * Math.max(Math.ceil(Rv/rh), Math.ceil(Sv/sh))* p);
        }
        System.out.print(ans);
    }
}