import java.util.*;

public class Main {
    public static void main(String[] args) throws  Exception{
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++){
            int N=sc.nextInt();
            float deal = Float.MAX_VALUE;
            int ans=Integer.MAX_VALUE;
            for(int i=0;i<N;i++){
                float g=sc.nextFloat();
                int C=sc.nextInt();
                float tmp=C/g;
                if(tmp<=deal){
                    if(tmp==deal){
                        if(C<ans)
                            ans=C;
                    } else {
                        deal=tmp;
                        ans=C;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}