import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken());
        int[] dx = new int[]{-1, 1, 0, 0}, dy = new int[]{0, 0, -1, 1};
        char[][] arr = new char[R + 3][C + 3], brr = new char[R + 3][C + 3];
        for (int i = 0; i < R + 2; i++) {
            Arrays.fill(arr[i], '.');
            Arrays.fill(brr[i], '.');
        }
        for (int i = 1; i <= R; i++)
            arr[i] = ("." + br.readLine()+".").toCharArray();
        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= C; j++) {
                brr[i][j]='.';
                if (arr[i][j] == 'X') {
                    int cnt = 0;
                    for (int k = 0; k < 4; k++)
                        if (arr[i + dx[k]][j + dy[k]] == '.')
                            cnt++;
                    if (cnt >= 3)
                        brr[i][j] = '.';
                    else
                        brr[i][j]='X';
                } else {
                    brr[i][j] = '.';
                }
            }
        }
        int minr=1, maxr=R, minc=1, maxc=C;
        for(int i=1;i<=R;i++)
            if(String.valueOf(brr[i]).contains("X")) {
                minr = i;
                break;
            }
        for(int i=R;i>0;i--)
            if(String.valueOf(brr[i]).contains("X")) {
                maxr = i;
                break;
            }
        for (int j = 1; j <= C; j++){
            int cnt=0;
            for(int i=1;i<=R;i++) {
                if (brr[i][j] == 'X')
                    cnt++;
            }
            if(cnt>0) {
                minc = j;
                break;
            }
        }
        for(int j=C;j>0;j--){
            int cnt=0;
            for(int i=1;i<=R;i++){
                if(brr[i][j]=='X')
                    cnt++;
            }
            if(cnt>0) {
                maxc=j;
                break;
            }
        }

        for(int i=minr;i<=maxr;i++){
            for(int j=minc;j<=maxc;j++)
                System.out.print(brr[i][j]);
            System.out.println();
        }
    }
}
