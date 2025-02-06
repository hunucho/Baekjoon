import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), K=Integer.parseInt(st.nextToken());
        HashMap<Integer,Integer> hm = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)
            hm.put(Integer.parseInt(st.nextToken()), i);
        boolean ans=true;
        for(int i=0;i<N && ans;i++){
            int idx = hm.get(i), dist = Math.abs(idx-i);
            if(dist%K!=0)
                ans=false;
        }
        System.out.println(ans?"Yes":"No");
    }
}