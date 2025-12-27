import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken()), b=Integer.parseInt(st.nextToken());
            b = Math.min(b, a-b);
            long ans=1;
            if(a==0 && b==0)
                break;
            for(int i=1;i<=b;i++){
                ans*=a-i+1;
                ans/=i;
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}