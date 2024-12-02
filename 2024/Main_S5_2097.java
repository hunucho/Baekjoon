import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        for(int i=2;i<=30000;i++)
            for(int j=i;j<=i+1;j++){
                if(i*j>=N) {
                    System.out.println(2 * (i-1 + j-1));
                    return;
                }
            }
    }
}