import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            int n=Integer.parseInt(br.readLine());
            System.out.println("++++ ".repeat(n/5)+"|".repeat(n%5));
        }
    }
}
