import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int [] S = new int [N], C = new int [N], L=new int [N];
        for(int i=0;i<N;i++){
            S[i]=sc.nextInt();
            C[i]=sc.nextInt();
            L[i]=sc.nextInt();
        }
        boolean chk1=false, chk2=false;
        int ans=1, maxS=S[0];
        for(int i=1;i<N;i++){
            if(maxS==S[i])
                chk1=true;
            if(S[i]>maxS) {
                maxS = S[i];
                ans=i+1;
            }
        }
        int minC=99;
        if(chk1){
            for(int i=0;i<N;i++){
                if(S[i]==maxS){
                    if(minC==C[i])
                        chk2=true;
                    if( C[i]<minC){
                        minC=C[i];
                        ans=i+1;
                    }
                }
            }
        }
        int minL=999;
        if(chk2){
            for(int i=0;i<N;i++){
                if(S[i]==maxS && C[i]==minC){
                    if(minL>L[i]){
                        minL=L[i];
                        ans=i+1;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}