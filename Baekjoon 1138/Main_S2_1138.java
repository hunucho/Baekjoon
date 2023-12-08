import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int [] arr = new int [N];
        for(int i=1;i<=N;i++){
            int tmp=sc.nextInt(), cnt=-1;
            for(int j=0;j<N;j++){
                cnt+=arr[j]==0?1:0;
                if(cnt==tmp) {
                    arr[j] = i;
                    break;
                }
            }
        }
        for(int i=0;i<N;i++)
            System.out.print(arr[i]+" ");
    }
}
