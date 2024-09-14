import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hm = new HashMap<>();
        int ans=0, penalty=0;
        while(true){
            int m=sc.nextInt();
            if(m==-1)
                break;
            String name = sc.next(), result=sc.next();
            if(result.compareTo("right")==0) {
                ans++;
                penalty+=m+hm.getOrDefault(name, 0)*20;
            } else
                hm.put(name, hm.getOrDefault(name, 0)+1);
        }
        System.out.println(ans+" "+penalty);
    }
}