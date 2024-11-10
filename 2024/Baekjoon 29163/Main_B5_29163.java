import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int even=0, odd=0;
        for (int i = 0; i < n; i++){
            int tmp=Integer.parseInt(st.nextToken());
            if(tmp%2==0)
                even++;
            else
                odd++;
        }
        System.out.println(even>odd?"Happy":"Sad");
    }
}