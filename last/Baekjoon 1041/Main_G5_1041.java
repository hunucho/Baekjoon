import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N=sc.nextLong(), ans=0;
        int m3=0, m2=999, m1=999;
        int [] dices = new int [6];
        for(int i=0;i<6;i++)
            m1 = Math.min(m1, dices[i]=sc.nextInt());
        if(N==1){
            int M=0;
            for(int i=0;i<6;i++){
                ans += dices[i];
                M = Math.max(M,dices[i]);
            }
            ans-=M;
        }
        else {
            for(int i=0;i<6;i++)
                for(int j=0;j<6;j++)
                    if(i!=j && i+j!=5)
                        m2=Math.min(m2,dices[i]+dices[j]);
            m3=Math.min(dices[0], dices[5])+Math.min(dices[1], dices[4])+Math.min(dices[2], dices[3]);
            ans=4*m3+(8*N-12)*m2+(5*N*N-16*N+12)*m1;
        }
        System.out.println(ans);
    }
}
