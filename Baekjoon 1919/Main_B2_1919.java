import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A=sc.nextLine(), B=sc.nextLine();
        int [] arr = new int [26], brr = new int [26];
        int ans=0;
        for(int i=0;i<A.length();i++)
            arr[A.charAt(i) - 'a']++;
        for(int i=0;i<B.length();i++)
            brr[B.charAt(i)-'a']++;
        for(int i=0;i<26;i++)
            ans+=Math.max(arr[i], brr[i])-Math.min(arr[i], brr[i]);
        System.out.println(ans);
    }
}
