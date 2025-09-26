import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws  Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int [] arr = new int [26];
        String S = br.readLine();
        for(int i=0;i<N/2;i++)
            arr[S.charAt(i)-'a']++;
        if(N%2==0)
            for(int j=N-1;j>=N/2;j--)
                arr[S.charAt(j)-'a']++;
        else
            for(int j=N-1;j>N/2;j--)
                arr[S.charAt(j)-'a']++;
        boolean ans=true;
        for(int i=0;i<26;i++)
            if(arr[i]%2!=0)
                ans=false;
        System.out.print(ans?"Yes":"No");
    }
}
