import java.util.*;

public class Main {
    public static void main(String[] args) throws  Exception{
        Scanner sc = new Scanner(System.in);
        int [] arr = new int [3];
        for(int i=0;i<3;i++)
            arr[i]=sc.nextInt();
        int N=sc.nextInt(), ans=0;
        for(int n=0;n<N;n++){
            int tmp=0;
            for(int i=0;i<3;i++)
                for(int j=0;j<3;j++)
                    tmp+=arr[j]*sc.nextInt();
            ans=Math.max(ans,tmp);
        }
        System.out.println(ans);
    }
}