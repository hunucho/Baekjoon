import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<int []> al;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken());
        int x=0, y=0, ans=0;
        al = new ArrayList<>();
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            al.add(new int [] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
        }
        for(;M>0; M--){
            Sort(x, y);
            int nx = al.get(0)[0], ny = al.get(0)[1];
            ans+=(int)(Math.pow(nx-x, 2) + Math.pow(ny-y, 2));
            x = nx;
            y = ny;
            al.remove(0);
            st = new StringTokenizer(br.readLine());
            al.add(new int [] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
        }
        System.out.println(ans);
    }
    public static void Sort(int x, int y){
        Collections.sort(al, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                int tmp1 = (int)(Math.pow(o1[0] - x, 2) + Math.pow(o1[1] - y, 2));
                int tmp2 = (int)(Math.pow(o2[0] - x, 2) + Math.pow(o2[1] - y, 2));
                return tmp2 - tmp1;
            }
        });
    }
}