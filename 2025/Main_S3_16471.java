import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        int [] J = new int [N], S = new int [N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)
            J[i]=Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)
            S[i]=Integer.parseInt(st.nextToken());
        Arrays.sort(J);
        Arrays.sort(S);
        int j=0, cnt=0;
        for(int i=0;i<N;i++){
            for(;j<N;j++){
                if(J[i]<S[j]) {
                    cnt++;
                    j++;
                    break;
                }
            }
        }
        System.out.print(cnt>=(N+1)/2?"YES":"NO");
    }
}