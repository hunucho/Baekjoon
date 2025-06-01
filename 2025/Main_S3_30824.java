import java.io.*;
import java.util.*;
public class Main {
    static ArrayList<Long> al;
    static boolean done;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        al = new ArrayList<>();
        long a=1, b=1;
        al.add(1L);
        while(true){
            if(a+b>=Math.pow(10, 16))
                break;
            long c = a+b;
            al.add(c);
            a=b;
            b=c;
        }
        for(int t=0;t<T;t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int k=Integer.parseInt(st.nextToken());
            long x=Long.parseLong(st.nextToken());
            done = false;
            f(k, x, 0);
            System.out.println(done?"YES":"NO");
        }
    }
    public static boolean f(int k, long x, long sum){
        if((k==0 && sum==x) || done){
            done=true;
            return true;
        }
        else if(k==0 && sum!=x)
            return false;
        for(int i=0;i<al.size();i++){
            f(k-1, x, sum+al.get(i));
        }
        return false;
    }
}