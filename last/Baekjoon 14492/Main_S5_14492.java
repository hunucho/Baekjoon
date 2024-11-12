import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), ans=0;
        boolean [][] arr = new boolean[N][N], brr=new boolean[N][N];
        for(int i=0;i<N;i++)
            for(int j=0;j<N;j++)
                arr[i][j]=sc.nextInt()==1?true:false;
        for(int i=0;i<N;i++)
            for(int j=0;j<N;j++)
                brr[i][j]=sc.nextInt()==1?true:false;

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++) {
                for(int k=0;k<N;k++)
                    if (arr[i][k] && brr[k][j]){
                        ans++;
                        break;
                    }
            }
        }
        System.out.println(ans);
    }
}
