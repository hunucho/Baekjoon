import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer stClothes = new StringTokenizer(br.readLine());
        int A[] = new int [N];
        char B[] = new char [N];
        StringBuilder sb = new StringBuilder();
        int U=Integer.parseInt(stClothes.nextToken()), D=Integer.parseInt(stClothes.nextToken());
        int u=0, d=0, b=0;
        boolean pass = true;
        for(int i=0;i<N;i++){
            int sw = Integer.parseInt(st.nextToken());
            A[i]=sw;
            if(sw==1) {
                B[i] = 'U';
                u++;
            } else if(sw==2){
                B[i]='D';
                d++;
            } else if(sw==3){
                B[i]='0';
                b++;
            }
        }
        U-=u;
        D-=d;
        if(U<0 || D<0)
            pass = false;

        for(int i=0;i<N;i++){
            if(B[i]=='0') {
                if(U>0) {
                    B[i] = 'U';
                    U--;
                }
                else {
                    B[i] = 'D';
                    D--;
                }
            }
            sb.append(B[i]);
        }
        System.out.println(pass?"YES\n"+sb:"NO");
    }
}