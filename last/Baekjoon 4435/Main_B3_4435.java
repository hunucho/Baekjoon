import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        int [] G = new int [] {1, 2, 3, 3, 4, 10}, S=new int [] {1, 2, 2, 2, 3, 5, 10};
        for(int t=1;t<=T;t++){
            StringTokenizer st1=new StringTokenizer(br.readLine()), st2=new StringTokenizer(br.readLine());
            String ans="";
            int g=0, s=0;
            for(int i=0;i<G.length;i++)
                g+=Integer.parseInt(st1.nextToken())*G[i];
            for(int i=0;i<S.length;i++)
                s+=Integer.parseInt(st2.nextToken())*S[i];
            if(g>s)
                ans="Good triumphs over Evil";
            else if (g<s)
                ans="Evil eradicates all trace of Good";
            else
                ans="No victor on this battle field";
            System.out.println("Battle "+t+": "+ans);
        }
    }
}
