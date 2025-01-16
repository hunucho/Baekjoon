import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String X=br.readLine();
        boolean ans=true;
        int len=X.length();
        int [] x = new int [len];
        for(int i=0;i<len;i++)
            x[i]=X.charAt(i)-'0';
        if(x[0]>=x[1] || x[len-2]<=x[len-1])
            ans=false;
        int last = x[1]-x[0];
        for(int i=1;i<len;i++){
            int d=x[i]-x[i-1];
            if(d==0)
                ans=false;
            if(d>0 && last!=d && last>0)
                ans=false;
            if(d<0 && last!=d && last<0)
                ans=false;
            if((d>0 && last<0) || (d<0 && last>0))
                last=d;
        }
        System.out.println(ans?"ALPSOO":"NON ALPSOO");
    }
}