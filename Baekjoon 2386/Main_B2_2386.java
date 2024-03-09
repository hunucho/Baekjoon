import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while((str = br.readLine()).compareTo("#")!=0){
            StringTokenizer st = new StringTokenizer(str);
            char ch = st.nextToken().charAt(0);
            int cnt=0;
            while(st.hasMoreTokens()){
                String tmp = st.nextToken().toLowerCase();
                for(char c : tmp.toCharArray())
                    if(ch==c)
                        cnt++;
            }
            System.out.println(ch+" "+cnt);
        }
    }
}