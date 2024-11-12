import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), M=sc.nextInt(), ans=0;
        int [][] map = new int [N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++) {
                map[i][j] = sc.nextInt();
                ans+=4*map[i][j]+2;
                if(j>0)
                    ans-=2*(Math.min(map[i][j],map[i][j-1]));
                if(i>0)
                    ans-=2*(Math.min(map[i][j],map[i-1][j]));
            }
        }
        System.out.println(ans);
    }
}
