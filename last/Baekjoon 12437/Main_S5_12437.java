import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T=Integer.parseInt(br.readLine());
        for(int t=1;t<=T;t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken()), y=Integer.parseInt(st.nextToken()), z=Integer.parseInt(st.nextToken()), ans=0;
            for(int i=0, k=0;i<x;i++){
                if(k!=z)
                    ans++;
                for(int j=0;j<y;j++,k++){
                    if(k==z) {
                        ans++;
                        k=0;
                    }
                }
            }
            sb.append("Case #"+t+": "+ans+"\n");
        }
        System.out.print(sb);
    }
}
