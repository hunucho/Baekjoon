import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine()), size = (int)Math.pow(2,N);
        String S=br.readLine();
        String [] arr = new String [size];
        for(int i=0;i<size;i++){
            String tmp = String.valueOf(Integer.toBinaryString(i));
            tmp = "0".repeat(N-tmp.length())+tmp;
            arr[i]=tmp;
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int cnt1=0, cnt2=0;
                for(char ch:o1.toCharArray())
                    if(ch=='1')
                        cnt1++;
                for(char ch:o2.toCharArray())
                    if(ch=='1')
                        cnt2++;
                if(cnt1==cnt2) {
                    StringBuilder sb1 = new StringBuilder(o1).reverse();
                    StringBuilder sb2 = new StringBuilder(o2).reverse();
                    return sb1.compareTo(sb2);
                }
                return cnt1-cnt2;
            }
        });
        for(int i=0;i<size;i++)
            if(S.compareTo(arr[i])==0)
                System.out.println(i);
    }
}