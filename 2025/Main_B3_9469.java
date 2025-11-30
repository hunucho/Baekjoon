import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int P=Integer.parseInt(br.readLine());
        for(int p=0;p<P;p++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N=Integer.parseInt(st.nextToken());
            double D=Double.parseDouble(st.nextToken());
            double A=Double.parseDouble(st.nextToken()), B=Double.parseDouble(st.nextToken()), F=Double.parseDouble(st.nextToken());
            System.out.printf("%d %.6f\n", N, D/(A+B)*F);

        }
    }
}