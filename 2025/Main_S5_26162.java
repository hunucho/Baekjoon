import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=2;i<120;i++)
            if(isPrime(i))
                al.add(i);
        boolean [] a = new boolean[130];
        for(int i=0;i<al.size();i++)
            for(int j=0;j<al.size();j++) {
                if(al.get(i)+al.get(j)<120)
                    a[al.get(i) + al.get(j)] = true;
            }
        for(int i=0;i<N;i++){
            int tmp=Integer.parseInt(br.readLine());
            System.out.println(a[tmp]?"Yes":"No");
        }
    }
    public static boolean isPrime (int a){
        for(int i=2;i<=Math.pow(a,0.5);i++){
            if(a%i==0)
                return false;
        }
        return true;
    }
}