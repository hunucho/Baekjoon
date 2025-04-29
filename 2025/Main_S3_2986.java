import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine()), ans=0;
        for(int i=N-1;i>=1;i--){
            ans++;
            if(N%i==0)
                break;
        }
        System.out.println(ans);
    }
}