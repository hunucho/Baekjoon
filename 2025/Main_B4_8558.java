import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine()), ans=1;
        if(N==2)
            ans=2;
        else if(N==3)
            ans=6;
        else if(N==4)
            ans=4;
        else if(N>=5)
            ans=0;
        System.out.println(ans);
    }
}
