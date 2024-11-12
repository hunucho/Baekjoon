import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] ch = new int[N];
        for(int i=0;i<N;i++)
            ch[i] = Integer.parseInt(st.nextToken());
        int K=Integer.parseInt(br.readLine()), l=N/K;
        for(int i=0;i<K;i++)
            Arrays.sort(ch,i*l,(i+1)*l);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++)
            sb.append(ch[i]).append(" ");
        System.out.println(sb);
    }
}

/*
8
9 8 7 6 5 4 3 2
4


 */