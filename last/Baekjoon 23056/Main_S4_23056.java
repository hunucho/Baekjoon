import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        int N=sc.nextInt(), M=sc.nextInt();
        PriorityQueue<String> [] pq = new PriorityQueue[N+1];
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=N;i++)
            pq[i] = new PriorityQueue<>(new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    if(o1.length()==o2.length())
                        return o1.compareTo(o2);
                    return o1.length()-o2.length();
                }
            });
        while(true){
            int c = sc.nextInt();
            String name = sc.next();
            if(c==0)
                break;
            if(pq[c].size()<M)
                pq[c].add(name);
        }
        for(int i=1;i<=N;i+=2){
            while(pq[i].size()>0)
                sb.append(i).append(" ").append(pq[i].poll()).append("\n");
        }
        for(int i=2;i<=N;i+=2){
            while(pq[i].size()>0)
                sb.append(i).append(" ").append(pq[i].poll()).append("\n");
        }
        System.out.println(sb);
    }
}