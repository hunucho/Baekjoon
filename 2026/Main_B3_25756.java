import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        double V = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int t=0;t<T;t++) {
            int A = Integer.parseInt(st.nextToken());
            V = (1-(1-V)*(100-A)/100);
            System.out.printf("%.7f\n",V*100);
        }
    }
}