import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int occupied=0, max=0, peace=0, peaceful=0, longest=0;
        int [] T = new int [370], S = new int [370];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            char c = st.nextToken().charAt(0);
            int s = Integer.parseInt(st.nextToken()), e=Integer.parseInt(st.nextToken());
            longest = Math.max(longest, e-s+1);
            for(int j=s;j<=e;j++){
                if(c=='T')
                    T[j]++;
                else if(c=='S')
                    S[j]++;
            }
        }
        for(int i=1;i<=366;i++){
            if(T[i]>0 || S[i]>0)
                occupied++;
            max = Math.max(max, T[i]+S[i]);
            if(T[i]==S[i] && T[i]>0 && S[i]>0) {
                peace++;
                peaceful = Math.max(peaceful, T[i]+S[i]);
            }
        }
        System.out.println(occupied);
        System.out.println(max);
        System.out.println(peace);
        System.out.println(peaceful);
        System.out.println(longest);
    }
}