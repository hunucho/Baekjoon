import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=1;
        while(true) {
            int N = Integer.parseInt(br.readLine());
            if(N==0)
                break;;
            String[] name = new String[N];
            for (int i = 0; i < N; i++)
                name[i] = br.readLine();
            HashSet<Integer> hs = new HashSet<>();
            for(int i=0;i<2*N-1;i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int num=Integer.parseInt(st.nextToken());
                if(hs.contains(num))
                    hs.remove(num);
                else
                    hs.add(num);
            }
            int order = (int) hs.toArray()[0];
            System.out.printf("%d %s\n",T,name[order-1]);
            T++;
        }

    }
}

