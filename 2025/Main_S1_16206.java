import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken()), ans=0;
        ArrayList<Integer> ten = new ArrayList<>(), al = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            int tmp = Integer.parseInt(st.nextToken());
            if(tmp%10==0){
                if(tmp==10)
                    ans++;
                else
                    ten.add(tmp);
            } else if(tmp>10)
                al.add(tmp);
        }
        Collections.sort(ten);
        for(int i=0;i<ten.size();i++) {
            int num = ten.get(i);
            if (num % 10 == 0) {
                int tmp = num / 10 - 1;
                if (tmp <= M) {
                    M -= tmp;
                    ans += num / 10;
                } else {
                    ans += M;
                    M = 0;
                }
            }
        }
        for(int i=0;i<al.size();i++){
            int a = al.get(i);
            if(a>10 && M>0) {
                int tmp = a / 10;
                if (tmp > M)
                    ans += M;
                else
                    ans += tmp;
                M -= tmp;
            }
        }
        System.out.print(ans);
    }
}