import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            Long [] l=new Long[3];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0;i<3;i++)
                l[i]=Long.parseLong(st.nextToken());
            Arrays.sort(l);
            bw.write((long)Math.pow(l[0]+l[1],2)+l[2]*l[2]+"\n");
        }
        bw.close();
    }
}
