import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> A=new HashMap<>(), B=new HashMap<>();
        Queue<String> q = new LinkedList<>();
        for(int i=0;i<N;i++)
            A.put(st.nextToken(), i);
        st = new StringTokenizer(br.readLine());
        int max=-1;
        for(int i=0;i<N;i++) {
            String id = st.nextToken();
            int diff =A.get(id)-i;
            if(diff>max){
                max=diff;
                q = new LinkedList<>();
                q.add(id);
            } else if (diff==max)
                q.add(id);
        }
        while(q.size()>0)
            sb.append(q.poll()).append(" ");
        System.out.println(sb.toString());
    }
}