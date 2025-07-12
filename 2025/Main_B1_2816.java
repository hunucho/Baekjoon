import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String [] ch = new String [N];
        int idx1=0, idx2=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++) {
            ch[i] = br.readLine();
            if(ch[i].compareTo("KBS1")==0)
                idx1=i;
            if(ch[i].compareTo("KBS2")==0)
                idx2=i;
        }
        for(int i=0;i<idx1;i++)
            sb.append(1);
        for(int i=0;i<idx1;i++)
            sb.append(4);
        if(idx1>idx2)
            idx2++;
        for(int i=0;i<idx2;i++)
            sb.append(1);
        for(int i=0;i<idx2-1;i++)
            sb.append(4);
        System.out.println(sb);
    }
}