import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), M=sc.nextInt(), K=sc.nextInt(), ans=0, max=0, min=0;
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i=0;i<N;i++)
            hm.put(sc.next(), sc.nextInt());
        for(int i=0;i<K;i++) {
            String t=sc.next();
            int score = hm.get(t);
            ans+=score;
            hm.remove(t);
        }
        int [] tmp = new int[N-K];
        int i=0;
        Iterator<String> iter = hm.keySet().iterator();
        while(iter.hasNext()){
            String str = iter.next();
            tmp[i++]=hm.get(str);
        }
        Arrays.sort(tmp);

        for(int j=0;j<M-K;j++)
            min+=tmp[j];
        for(int j=0;j<M-K;j++)
            max+=tmp[N-K-1-j];
        max+=ans;
        min+=ans;

        System.out.println(min+" "+max);
    }
}
