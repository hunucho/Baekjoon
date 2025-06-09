import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int Y= Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken()), D=Integer.parseInt(st.nextToken());
        int N=Integer.parseInt(br.readLine());
        String [] S = {"invalid", "safe", "unsafe"};
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int A= Integer.parseInt(st.nextToken()), B=Integer.parseInt(st.nextToken()), C=Integer.parseInt(st.nextToken());
            int ans=0;
            // Y/M/D
            if(isValid(A, B, C) && ans!=2)
                ans = isSafe(Y, M, D, A, B, C)?1:2;
            if(isValid(C, B, A) && ans!=2)
                ans = isSafe(Y, M, D, C, B, A)?1:2;
            if(isValid(C, A, B) && ans!=2)
                ans = isSafe(Y, M, D, C, A, B)?1:2;
            sb.append(S[ans]).append("\n");
        }
        System.out.print(sb);
    }
    public static boolean isValid(int y, int m, int d){
        int [] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(y%4==0)
            month[2] = 29;
        if(m==0 || d==0 || m>12 || d>month[m])
            return false;
        return true;
    }
    public static boolean isSafe(int Y, int M, int D, int A, int B, int C){
        if(Y<A || (Y==A && M<B) || (Y==A && M==B && D<=C))
            return true;
        return false;
    }
}