import java.util.*;
public class Main {
    static HashSet<String> hs;
    static String [][] map;
    static int [] dx, dy;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        map = new String [5][5];
        hs = new HashSet<>();
        dx = new int [] {-1, 1, 0, 0};
        dy = new int [] {0, 0, -1, 1};
        for(int i=0;i<5;i++)
            for(int j=0;j<5;j++)
                map[i][j] = sc.next();
        for(int i=0;i<5;i++)
            for(int j=0;j<5;j++)
                DFS(i,j,0, "");
        System.out.println(hs.size());
    }

    public static void DFS(int x, int y, int depth, String str){
        str+=map[x][y];
        if(depth==5) {
            hs.add(str);
            return;
        }
        for(int i=0;i<4;i++){
            int nx = x + dx[i], ny = y + dy[i];
            if(nx>=0 && nx<5 && ny>=0 && ny<5)
                DFS(nx, ny, depth+1, str);
        }
    }
}
