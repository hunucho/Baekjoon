import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String ans="";
        for(int i=0;i<N;i++){
            String tmp=br.readLine();
            if(tmp.contains("S"))
                ans=tmp;
        }
        System.out.println(ans);
    }
}