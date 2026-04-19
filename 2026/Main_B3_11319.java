import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int S = Integer.parseInt(br.readLine());
        for(int i=0;i<S;i++){
            String s = br.readLine().toLowerCase();
            int v=0, c=0;
            for(char ch : s.toCharArray()){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    v++;
                else if(ch==' ')
                    continue;
                else
                    c++;
            }
            System.out.println(c+" "+v);
        }
    }
}