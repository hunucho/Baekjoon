import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken()), Q=Integer.parseInt(st.nextToken());
        int [] pointer = new int [M+1];
        for(int i=1;i<=M;i++)
            pointer[i]=Integer.parseInt(br.readLine());
        for(int q=0;q<Q;q++){
            st = new StringTokenizer(br.readLine());
            char sw = st.nextToken().charAt(0);
            int op1 = Integer.parseInt(st.nextToken());
            if(sw=='a'){
                int op2 = Integer.parseInt(st.nextToken());
                pointer[op1] = pointer[op2];
            } else if(sw=='s'){
                int op2 = Integer.parseInt(st.nextToken());
                int tmp = pointer[op1];
                pointer[op1]=pointer[op2];
                pointer[op2]=tmp;
            } else {
                pointer[op1]=0;
            }
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int i=1;i<=M;i++)
            hs.add(pointer[i]);
        if(hs.contains(0))
            hs.remove(0);
        Integer [] arr = hs.toArray(new Integer[0]);
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        sb.append(arr.length).append("\n");
        for(int i=0;i<arr.length;i++)
            sb.append(arr[i]).append("\n");
        System.out.print(sb);
    }
}