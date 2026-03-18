import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        long l = 1, r = 1987654321;
        while(l<r){
            long m=(l+r)/2;
            long tmp = 3*m*(m-1)+1;
            if(tmp<N)
                l=m+1;
            else
                r=m;
        }
        System.out.print(r);
    }
}
