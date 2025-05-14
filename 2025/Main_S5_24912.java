import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        boolean possible=true;
        int [] a = new int [N+2];
        for(int i=1;i<=N;i++) {
            a[i] = Integer.parseInt(st.nextToken());
            if(i>1 && a[i]!=0 && a[i]==a[i-1])
                possible=false;
        }
        if(!possible){
            System.out.print(-1);
        } else {
            for(int i=1;i<=N;i++){
                if(a[i]==0)
                    a[i]=getColor(a[i-1], a[i+1]);
            }
            StringBuilder sb = new StringBuilder();
            for(int i=1;i<=N;i++){
                sb.append(a[i]).append(" ");
            }
            System.out.println(sb);
        }
    }
    public static int getColor(int l, int r){
        for(int i=1;i<=3;i++){
            if(i!=l && i!=r)
                return i;
        }
        return 0;
    }
}