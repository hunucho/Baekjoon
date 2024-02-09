import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int happy=0, sad=0;
        int len=str.length();
        happy=len-str.replaceAll(":-\\)","").length();
        sad=len-str.replaceAll(":-\\(","").length();
        String ans="";
        if(happy==0 && sad==0)
            ans="none";
        else if(happy>sad)
            ans="happy";
        else if(happy<sad)
            ans="sad";
        else
            ans="unsure";
        System.out.println(ans);
    }
}