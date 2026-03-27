import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int t = Integer.parseInt(br.readLine());
            int d = t%25;
            if(0<=d && d<=16)
                System.out.println("ONLINE");
            else
                System.out.println("OFFLINE");
        }
    }
}
