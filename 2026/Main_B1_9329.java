import java.io.*;
import java.util.*;

public class Main {
    static class Prize{
        ArrayList<Integer> condition;
        int prize;
        public Prize(){
            condition = new ArrayList<>();
            prize=0;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken());
            int [] stickers = new int [M+1];
            ArrayList<Prize> list = new ArrayList<>();
            for(int i=0;i<N;i++){
                list.add(new Prize());
                st = new StringTokenizer(br.readLine());
                int k=Integer.parseInt(st.nextToken());
                for(int j=0;j<k;j++){
                    list.get(i).condition.add(Integer.parseInt(st.nextToken()));
                }
                list.get(i).prize = Integer.parseInt(st.nextToken());
            }
            Collections.sort(list, new Comparator<Prize>() {
                @Override
                public int compare(Prize o1, Prize o2) {
                    return o2.prize-o1.prize;
                }
            });
            st = new StringTokenizer(br.readLine());
            for(int i=1;i<=M;i++)
                stickers[i] = Integer.parseInt(st.nextToken());

            int ans = 0;
            for (Prize data : list) {
                int min = Integer.MAX_VALUE;
                for (int need : data.condition) {
                    min = Math.min(min, stickers[need]);
                }
                ans += min*data.prize;
            }
            System.out.println(ans);
        }
    }
}
