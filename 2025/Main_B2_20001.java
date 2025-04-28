import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int cnt=0;
        while((S=br.readLine()).compareTo("고무오리 디버깅 끝")!=0){
            if(S.compareTo("고무오리")==0){
                if(cnt>0)
                    cnt--;
                else
                    cnt+=2;
            } else
                cnt++;
        }
        System.out.println(cnt==0?"고무오리야 사랑해":"힝구");
    }
}