import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), A=Integer.parseInt(st.nextToken()), D=Integer.parseInt(st.nextToken());
        int target=A, ans=0;
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            int tmp = Integer.parseInt(st.nextToken());
            if(tmp==target) {
                ans++;
                target+=D;
            }
        }
        System.out.print(ans);
    }
}