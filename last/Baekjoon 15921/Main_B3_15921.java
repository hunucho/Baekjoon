import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        if(N==0) {
            System.out.println("divide by zero");
            return;
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        double numerator=0, denominator=0;
        for(int i=0;i<N;i++) {
            double t = Double.parseDouble(st.nextToken());
            numerator+=t;
            denominator+=t/N;
        }
        System.out.printf("%.2f",numerator/N/denominator);
    }
}