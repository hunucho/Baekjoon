import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char [] A=br.readLine().toCharArray(), B=br.readLine().toCharArray();
        StringBuilder a = new StringBuilder(), b = new StringBuilder(), c = new StringBuilder(), d = new StringBuilder(), e = new StringBuilder();

        for(int i=0;i<A.length;i++){
            a.append(A[i]=='1' && A[i]==B[i]?"1":"0");
            b.append(A[i]=='1' || B[i]=='1'?"1":"0");
            c.append(A[i]!=B[i]?"1":"0");
            d.append(A[i]=='1'?"0":"1");
            e.append(B[i]=='1'?"0":"1");
        }
        System.out.println(a.append("\n").append(b).append("\n").append(c).append("\n").append(d).append("\n").append(e));
    }
}

