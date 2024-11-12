import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str="", tmp;
        int ans=0;
        while((tmp = br.readLine())!=null)
            str+=tmp;
        StringTokenizer st = new StringTokenizer(str,",");
        while(st.hasMoreTokens())
            ans+=Integer.parseInt(st.nextToken());
        System.out.println(ans);
    }
}