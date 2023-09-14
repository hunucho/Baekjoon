import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] dx = new int [] {-1,0,1,0}, dy = new int [] {0,1,0,-1};
        int T=sc.nextInt();
        sc.nextLine();
        for(int t=0;t<T;t++){
            String str=sc.nextLine();
            int curx=0, cury=0, dir=0, minx=0, maxx=0, miny=0, maxy=0;
            for(char ch:str.toCharArray()){
                switch (ch) {
                    case 'F':
                        curx+=dx[dir];
                        cury+=dy[dir];
                        break;
                    case 'B':
                        curx-=dx[dir];
                        cury-=dy[dir];
                        break;
                    case 'L':
                        dir=(dir+3)%4;
                        break;
                    case 'R':
                        dir=(dir+1)%4;
                        break;
                }
                minx=Math.min(minx, curx);
                maxx=Math.max(maxx, curx);
                miny=Math.min(miny, cury);
                maxy=Math.max(maxy, cury);
            }
            System.out.println((maxx-minx)*(maxy-miny));
        }
    }
}
