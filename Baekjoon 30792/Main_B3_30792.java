import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine()), NUM=Integer.parseInt(br.readLine());
        int [] votes = new int [N-1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N-1;i++)
            votes[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(votes);
        int cnt=0;
        for(int i=0;i<N-1;i++){
            if(votes[i]<NUM)
                cnt++;
        }
        System.out.println(N-cnt);
    }

}