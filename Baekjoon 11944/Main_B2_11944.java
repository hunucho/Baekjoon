import java.util.*;
import java.io.*;
class Main {
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        int N=Integer.parseInt(str), M=Integer.parseInt(st.nextToken());
        System.out.println(str.repeat(N).substring(0, Math.min(M, str.length()*N)));
    }
}

/*
7 4 2
1 1 3 4 10 34 35

 */