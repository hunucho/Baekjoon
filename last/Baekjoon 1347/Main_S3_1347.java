import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [][] map = new char [105][105];
        int [] dx = new int [] {-1, 0, 1, 0}, dy = new int [] {0, 1, 0, -1};
        int minx=51, miny=51, maxx=51, maxy=51, x=51, y=51, dir=2;
        for(int i=0;i<105;i++)
            Arrays.fill(map[i],'#');
        map[x][y]='.';

        int N=sc.nextInt();
        if(N==0) {
            System.out.println(".");
            return;
        }
        sc.nextLine();
        String str=sc.nextLine();

        for(int i=0;i<N;i++){
            char cmd = str.charAt(i);
            switch (cmd) {
                case 'F' :
                    x+=dx[dir];
                    y+=dy[dir];
                    break;
                case 'R' :
                    dir=(dir+1)%4;
                    break;
                case 'L' :
                    dir=(dir+3)%4;
                    break;

            }
            minx=Math.min(minx, x);
            miny=Math.min(miny, y);
            maxx=Math.max(maxx, x);
            maxy=Math.max(maxy, y);
            map[x][y]='.';
        }

        for(int i=minx; i<=maxx; i++){
            for(int j=miny;j<=maxy;j++)
                System.out.print(map[i][j]);
            System.out.println();
        }
    }
}
