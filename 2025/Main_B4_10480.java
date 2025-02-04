import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            int x = Integer.parseInt(br.readLine());
            System.out.println(x%2==0?x+" is even":x+" is odd");
        }
    }
}