import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N=Integer.parseInt(br.readLine());
        boolean [] S = new boolean[21];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String oper = st.nextToken();
            if(oper.equals("all"))
                Arrays.fill(S,true);
            else if (oper.equals("empty"))
                Arrays.fill(S,false);
            else {
                int x = Integer.parseInt(st.nextToken());
                if(oper.equals("add"))
                    S[x]=true;
                else if(oper.equals("remove"))
                    S[x]=false;
                else if(oper.equals("check"))
                    bw.write(S[x]?"1\n":"0\n");
                else if(oper.equals("toggle"))
                    S[x]=!S[x];
            }
        }
        bw.close();
    }
}
