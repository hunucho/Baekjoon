import java.io.*;
import java.util.*;
public class Main {
    static boolean [] chk = new boolean [10];
    public static boolean isRepeated(int n){
        if(n<10)
            return false;
        Arrays.fill(chk, false);
        while(n>0){
            int t=n%10;
            if(!chk[t])
                chk[t]=true;
            else
                return true;
            n/=10;
        }
        return false;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=0, cnt=1;
        int [] arr = new int [1000001];

        for(int i=1;cnt<=1000000;i++){
            if(!isRepeated(i)){
                arr[cnt++]=i;
            }
        }
        while((n=Integer.parseInt(br.readLine()))!=0){
            System.out.println(arr[n]);
        }
    }
}