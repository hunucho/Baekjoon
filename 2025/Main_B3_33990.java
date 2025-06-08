import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int ans=999;
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int tmp=0;
            for(int j=0;j<3;j++)
                tmp+=Integer.parseInt(st.nextToken());
            if(tmp>=512 && tmp<ans)
                ans=tmp;
        }
        System.out.print(ans==999?-1:ans);
    }
}