import java.io.*;
import java.util.*;

class Time {
    int s, e;
    Time(int s, int e){
        this.s=s;
        this.e=e;
    }
}

class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        Time [] time = new Time[N];
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            time[i] = new Time(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        Arrays.sort(time, (Time t1, Time t2)->t1.s-t2.s);
        int ans=time[N-1].s;
        Arrays.sort(time, (Time t1, Time t2)->t1.e-t2.e);
        ans-=time[0].e;
        System.out.println(Math.max(ans, 0));
    }
}