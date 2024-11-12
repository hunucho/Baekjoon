import java.io.*;
import java.util.*;

class Main {
    static HashMap<Long, Long> hm;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N=Long.parseLong(st.nextToken()), P=Long.parseLong(st.nextToken()), Q=Long.parseLong(st.nextToken());
        hm = new HashMap<>();
        hm.put(0L, 1L);
        System.out.println(getA(N, P, Q));
    }

    static long getA (long N, long P, long Q) {
        if(hm.get(N)==null){
            long ret1 = getA(N/P, P, Q);
            long ret2 = getA(N/Q, P, Q);
            hm.put(N, ret1+ret2);
            return ret1+ret2;
        }
        return hm.get(N);
    }
}