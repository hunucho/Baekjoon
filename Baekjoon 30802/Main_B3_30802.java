import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc =new Scanner(System.in);
        int N=sc.nextInt();
        int [] size = new int[6];
        for(int i=0;i<6;i++)
            size[i]=sc.nextInt();
        int T=sc.nextInt(), P=sc.nextInt(), ans=0;
        for(int i=0;i<6;i++){
            int tmp=size[i]/T;
            ans+=tmp;
            size[i]-=T*tmp;
            if(size[i]>0)
                ans++;
        }
        System.out.println(ans);
        System.out.println(N/P+" "+N%P);
    }
}