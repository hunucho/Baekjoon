import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T=Integer.parseInt(br.readLine());
        int [] arr = new int [1000001];
        for(int t=0;t<T;t++){
            String S=br.readLine();
            int n = Integer.parseInt(S);
            if(arr[n]==0)
                arr[n]=f(n)?1:0;
            bw.write(arr[n]+"\n");
        }
        bw.close();
    }
    public static boolean f(int N){
        ArrayList<Integer> al;
        int n=N;
        for(int i=2;i<=64;i++)
        {
            al = new ArrayList<>();
            n=N;
            while(n>0){
                al.add(n%i);
                n/=i;
            }
            int j;
            for(j=0;j<=al.size()/2;j++)
                if(al.get(j)!=al.get(al.size()-j-1))
                    break;
            if(j>=al.size()/2)
                return true;
        }
        return false;
    }
}
