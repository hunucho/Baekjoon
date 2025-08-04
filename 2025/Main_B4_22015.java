import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int max=0, ans=0;
        int [] arr = new int [3];
        for(int i=0;i<3;i++)
            max=Math.max(max, (arr[i]=sc.nextInt()));
        for(int i=0;i<3;i++)
            ans+=max-arr[i];
        System.out.print(ans);
    }
}