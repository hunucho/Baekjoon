import java.io.*;
import java.util.*;
public class Main {
    static int [] arr;
    static int N, sorted;
    static void Reverse(int L){
        int [] brr = new int [N];
        int j=0;
        for(int i=0;i<L;i++)
            brr[j++]=arr[i];
        for(int i=sorted;i>=L;i--)
            brr[j++]=arr[i];
        arr = brr;
        sorted--;
    }
    static int GetMax(){
        int idx=9999, min=Integer.MIN_VALUE;
        for(int i=sorted;i>=0;i--){
            if(arr[i]>min) {
                idx = i;
                min = arr[i];
            }
        }
        return idx;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());
        sorted=N-1;
        arr = new int [N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)
            arr[i]=Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        int L=0, ans=0;
        while((L=GetMax())!=9999){
            if(L==sorted) {
                sorted--;
            } else{
                sb.append(L+1).append(" ").append(sorted + 1).append("\n");
                Reverse(L);
                ans++;
            }
        }
        System.out.println(ans);
        System.out.print(sb.toString());
    }
}