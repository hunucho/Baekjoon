import java.util.*;
import java.io.*;

public class Main {
    static int [][] arr;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i=0;i<N;i++){
            for(int j=0;j<4;j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for(int k=0;k<7;k++){
                    String tmp = st.nextToken();
                    if(tmp.compareTo("-")==0)
                        continue;
                    else {
                        if(j==0)
                            hm.put(tmp, hm.getOrDefault(tmp, 0)+4);
                        else if(j==1)
                            hm.put(tmp, hm.getOrDefault(tmp, 0)+6);
                        else if(j==2)
                            hm.put(tmp, hm.getOrDefault(tmp, 0)+4);
                        else if(j==3)
                            hm.put(tmp, hm.getOrDefault(tmp, 0)+10);

                    }
                }
            }
        }
        int max=-1, min=Integer.MAX_VALUE;
        for(String name:hm.keySet()){
            if(max<hm.get(name))
                max=hm.get(name);
            if(min>hm.get(name))
                min=hm.get(name);
        }
        //System.out.println(max+" "+min);
        System.out.println(min+12<max?"No":"Yes");
    }
}