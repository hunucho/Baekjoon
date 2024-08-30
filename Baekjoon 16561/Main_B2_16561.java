import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int ans=0, n=sc.nextInt();
        int [] arr = new int [1000];
        for(int i=1;i<1000;i++)
            arr[i]=3*i;
        for(int i=1;i<1000;i++) {
            if(arr[i]>n)
                break;
            for (int j = 1; j < 1000; j++) {
                if(arr[i]+arr[j]>n)
                    break;
                for (int k = 1; k < 1000; k++) {
                    if (arr[i] + arr[j] + arr[k] > n)
                        break;
                    if (arr[i] + arr[j] + arr[k] == n)
                        ans++;
                }
            }
        }
        System.out.println(ans);
    }
}