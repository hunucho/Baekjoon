import java.io.*;
import java.util.*;
public class Main {
    static class Container implements Comparable<Container>{
        int order;
        String name;
        public Container(int o, String s) {
            order = o;
            name = s;
        }
        @Override
        public int compareTo(Container o) {
            return o.order-this.order;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hm = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++)
            hm.put(br.readLine(), i);
        int K = Integer.parseInt(br.readLine());
        for(int i=0;i<K;i++) {
            String S = br.readLine();
            hm.put(S, hm.get(S)+200000);
        }
        Container [] containers = new Container[hm.size()];

        int i=0;
        for(Object s:hm.keySet().toArray()){
            containers[i++] = new Container(hm.get(s.toString()), s.toString());
        }
        Arrays.sort(containers);
        StringBuilder sb = new StringBuilder();
        for(i=0;i<containers.length;i++)
            sb.append(containers[i].name).append("\n");
        System.out.print(sb);

    }
}