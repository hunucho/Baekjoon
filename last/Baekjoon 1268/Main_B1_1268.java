import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int [][] arr = new int [N][5];
        int [] cnt = new int [N];
        for(int i=0;i<N;i++)
            for(int j=0;j<5;j++)
                arr[i][j]=sc.nextInt();
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(i==j)
                    continue;
                for(int k=0;k<5;k++){
                    if(arr[i][k]==arr[j][k]) {
                        cnt[i]++;
                        k=5;
                    }
                }
            }
        }
        int max=0, ans=0;
        for(int i=0;i<N;i++){
            if(cnt[i]>max) {
                max=cnt[i];
                ans=i;
            }
        }
        System.out.println(ans+1);
    }
}