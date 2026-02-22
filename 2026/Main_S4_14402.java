import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine()), ans=0;
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i=0;i<q;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            char flag = st.nextToken().charAt(0);
            int ret = hm.getOrDefault(name, 0);
            if(flag=='+'){
                hm.put(name, ret+1);
            } else {
                if(ret==0)
                    ans++;
                else
                    hm.put(name, ret-1);
            }
        }
        for(String name:hm.keySet()){
            int ret = hm.get(name);
            if(ret>=0)
                ans+=ret;
        }
        System.out.print(ans);
    }
}