import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String K = br.readLine();
        int even=0, odd=0;
        for(int i=0;i<N;i++)
            if((K.charAt(i)-'0')%2==0)
                even++;
            else
                odd++;
        System.out.print(even==odd?-1:even>odd?0:1);
    }
}