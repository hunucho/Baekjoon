import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char [][] key = new char [4][10];
        for(int i=0;i<4;i++)
            key[i] = br.readLine().toCharArray();
        String S = br.readLine();
        int minx=9, miny=9, maxx=0, maxy=0;
        for(char ch:S.toCharArray()){
            for(int i=0;i<4;i++)
                for(int j=0;j<10;j++)
                    if(ch==key[i][j]){
                        minx=Math.min(minx, i);
                        miny=Math.min(miny, j);
                        maxx=Math.max(maxx, i);
                        maxy=Math.max(maxy, j);
                    }
        }
        System.out.print(key[(minx+maxx)/2][(miny+maxy)/2]);
    }
}