import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int B = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken());
            if(B==0 && N==0)
                break;
            int L=0, R=0, A=0;
            while(true){
                if(Math.pow(A, N)<=B)
                    L=A;
                else if(Math.pow(A, N)>B) {
                    R=A;
                    break;
                }
                A++;
            }
            System.out.println(Math.abs(Math.pow(L, N)-B) <= Math.abs(Math.pow(R, N)-B)?L:R);
        }
    }
}