import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long H = Long.parseLong(st.nextToken()), cur = H, S = Long.parseLong(st.nextToken());
        long ans = 1;
        if(H<=2){
            ans=1;
        } else if(H<=4){
            ans=2+S;
        } else {
            ans = (3*S+H+1)/2;
        }
        System.out.print(ans);
    }
}