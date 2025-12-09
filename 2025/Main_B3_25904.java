import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), X = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int [] T = new int [N];
        for(int i=0;i<N;i++)
            T[i] = Integer.parseInt(st.nextToken());
        for(int i=0;X<210;X++){
            if(T[i]<X){
                System.out.print(i+1);
                break;
            }
            i=(i+1)%N;
        }
    }
}