import java.util.*;
public class Main {
    static boolean [][] map = new boolean[6][6];
    public static void main(String[] args) {
        System.out.println(knight() && valid()?"Valid":"Invalid");
    }
    public static boolean knight() {
        int [] dx = new int [] {-1,-2,-2,-1,1,2,2,1}, dy = new int [] {-2,-1,1,2,2,1,-1,-2};
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int curx=str.charAt(1)-'1', cury=str.charAt(0)-'A';
        int firstx=curx, firsty=cury;
        map[curx][cury]=true;
        for(int i=0;i<35;i++){
            str = sc.nextLine();
            int nextx=str.charAt(1)-'1', nexty=str.charAt(0)-'A';
            boolean chk=false;
            for(int j=0;j<8;j++) {
                if (curx + dx[j] == nextx && cury + dy[j] == nexty) {
                    curx = nextx;
                    cury = nexty;
                    map[curx][cury] = true;
                    chk=true;
                    break;
                }
            }
            if(!chk)
                return false;
        }
        for(int i=0;i<8;i++)
            if (curx + dx[i] == firstx && cury + dy[i] == firsty)
                return true;
        return false;
    }

    public static boolean valid() {
        for(int i=0;i<6;i++)
            for(int j=0;j<6;j++)
                if(!map[i][j])
                    return false;
        return true;
    }
}
