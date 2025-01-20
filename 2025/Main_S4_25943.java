import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int left=0, right=0;
        for(int i=0;i<N;i++){
            int stone = Integer.parseInt(st.nextToken());
            if(left<=right)
                left+=stone;
            else
                right+=stone;
        }
        int [] W = {100, 50, 20, 10, 5, 2, 1};
        int diff = Math.abs(left-right), ans=0;
        for(int w:W){
            ans+=diff/w;
            diff%=w;
        }
        System.out.println(ans);
    }
}