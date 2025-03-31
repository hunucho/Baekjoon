import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), P=Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int W=Integer.parseInt(st.nextToken()), L=Integer.parseInt(st.nextToken()), G=Integer.parseInt(st.nextToken());
        HashMap<String, Character> hm = new HashMap<>();
        for(int i=0;i<P;i++){
            st=new StringTokenizer(br.readLine());
            hm.put(st.nextToken(), st.nextToken().charAt(0));
        }
        int score=0;
        String ans = "I AM IRONMAN!!";
        for(int i=0;i<N;i++){
            if(hm.getOrDefault(br.readLine(), 'L')=='W')
                score+=W;
            else
                score-=L;
            if(score<0)
                score=0;
            if(score>=G)
                ans = "I AM NOT IRONMAN!!";
        }
        System.out.println(ans);
    }
}