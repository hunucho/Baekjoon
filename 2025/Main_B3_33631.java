import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] ingredient = new int [4];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<4;i++)
            ingredient[i] = Integer.parseInt(st.nextToken());
        int [] requirement = new int [4];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<4;i++)
            requirement[i] = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(br.readLine()), cnt=0;
        StringBuilder sb = new StringBuilder();
        for(int q=0;q<Q;q++){
            st = new StringTokenizer(br.readLine());
            int query = Integer.parseInt(st.nextToken()), para = Integer.parseInt(st.nextToken());
            if(query==1){
                boolean chk = true;
                for(int i=0;i<4;i++)
                    if(ingredient[i]<para*requirement[i])
                        chk = false;
                if(chk){
                    cnt+=para;
                    for(int i=0;i<4;i++)
                        ingredient[i]-=para*requirement[i];
                    sb.append(cnt+"\n");
                } else{
                    sb.append("Hello, siumii\n");
                }
            } else {
                ingredient[query-2]+=para;
                sb.append(ingredient[query-2]).append("\n");
            }
        }
        System.out.print(sb);
    }
}