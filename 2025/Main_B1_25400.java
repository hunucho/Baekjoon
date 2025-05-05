import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc =new Scanner(System.in);
        int N=sc.nextInt(), ans=0, cnt=1;
        int [] arr = new int [N];
        for(int i=0;i<N;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<N;i++){
            if(arr[i]!=cnt)
                ans++;
            else
                cnt++;
        }
        System.out.print(ans);
    }
}