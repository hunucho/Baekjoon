import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        //String S = "";
        //while((S=sc.next())!=""){
        int [] arr = new int [10005];
        arr[0]=1;
        for(int i=1;i<=10000;i++){
            arr[i] = arr[i-1]*i;
            while(arr[i]%10==0){
                arr[i]/=10;
            }
            arr[i]%=100000;
        }
        while(sc.hasNextInt()){
            int N=sc.nextInt();
            System.out.printf("%5d -> %d\n", N, arr[N]%10);
        }

    }
}