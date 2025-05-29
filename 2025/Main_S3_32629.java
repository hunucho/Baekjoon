import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            int N=Integer.parseInt(br.readLine());
            int len=(int)Math.pow(N,0.5);
            int x=len*len==N?len:len+1, y=x;
            while(x*(y-1)>=N)
                y--;
            bw.write(((x+y)*2)+"\n");
        }
        bw.close();
    }
}