import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str="";
        while((str = br.readLine().toLowerCase()).compareTo("*")!=0){
            char ch = str.charAt(0);
            boolean ans=true;
            StringTokenizer st = new StringTokenizer(str);
            while(st.hasMoreTokens())
                if(st.nextToken().charAt(0)!=ch)
                    ans=false;
            System.out.println(ans?"Y":"N");
        }
    }
}