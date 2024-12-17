import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), L=sc.nextInt(), K=sc.nextInt(), ans=0, cnt=0;
        int [][] arr = new int [N][2];
        for(int i=0;i<N;i++)
            for(int j=0;j<2;j++)
                arr[i][j]=sc.nextInt();
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        for(int i=0;i<N && cnt<K;i++){
            if(arr[i][1]<=L) {
                ans += 140;
                cnt++;
            } else if(arr[i][0]<=L){
                ans += 100;
                cnt++;
            }
        }
        System.out.println(ans);

    }
}

