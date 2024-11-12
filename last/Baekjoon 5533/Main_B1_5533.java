import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int [][] arr = new int [N][3], cnt = new int [3][101];
        int [] score = new int [N];
        for(int i=0;i<N;i++)
            for(int j=0;j<3;j++) {
                arr[i][j] = sc.nextInt();
                cnt[j][arr[i][j]]++;
            }
        for(int i=0;i<N;i++){
            for(int j=0;j<3;j++)
                if(cnt[j][arr[i][j]]==1)
                    score[i]+=arr[i][j];
        }
        for(int i=0;i<N;i++)
            System.out.println(score[i]);
    }
}