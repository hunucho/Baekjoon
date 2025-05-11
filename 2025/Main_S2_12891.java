import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int S=sc.nextInt(), P=sc.nextInt();
        String DNA = sc.next();
        int A=sc.nextInt(), C=sc.nextInt(), G=sc.nextInt(), T=sc.nextInt(), ans=0;
        int [] cnt = new int [256];
        for(int i=0;i<P;i++){
            char ch = DNA.charAt(i);
            cnt[ch]++;
        }
        for(int i=P;i<S;i++){
            if(cnt['A']>=A && cnt['C']>=C&& cnt['G']>=G&& cnt['T']>=T)
                ans++;
            cnt[DNA.charAt(i-P)]--;
            cnt[DNA.charAt(i)]++;
        }
        if(cnt['A']>=A && cnt['C']>=C&& cnt['G']>=G&& cnt['T']>=T)
            ans++;
        System.out.println(ans);
    }
}