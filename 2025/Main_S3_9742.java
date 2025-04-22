import java.io.*;
import java.util.*;
public class Main {
    static int cnt;
    static String ans;
    static void Permutation(String S, int depth, int N, char [] arr, boolean [] chk){
        if(depth==S.length()){
            cnt++;
            if(cnt==N)
                ans = String.valueOf(arr);
            return;
        }
        for(int i=0;i<S.length() && ans=="No permutation";i++){
            if(chk[i])
                continue;
            chk[i]=true;
            arr[depth]=S.charAt(i);
            Permutation(S, depth+1, N, arr, chk);
            chk[i]=false;
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line = br.readLine())!=null) {
            StringTokenizer st = new StringTokenizer(line);
            String S = st.nextToken();
            int N = Integer.parseInt(st.nextToken()), len=S.length();
            cnt=0;
            ans="No permutation";
            long max = 1;
            for (int i = 2; i <= S.length(); i++)
                max *= i;
            if (N <= max)
                Permutation(S, 0, N, new char [len], new boolean[len]);
            System.out.printf("%s %d = %s\n",S, N, ans);
        }
    }
}