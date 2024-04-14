import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Adrian = "ABC", Bruno = "BABC", Goran = "CCAABB";
        int A=0, B=0, G=0;
        int N=sc.nextInt(), ans=0;
        String str = sc.next();
        for(int i=0;i<N;i++){
            if(str.charAt(i)==Adrian.charAt(i%3))
                A++;
            if(str.charAt(i)==Bruno.charAt(i%4))
                B++;
            if(str.charAt(i)==Goran.charAt(i%6))
                G++;
            ans=Math.max(A, Math.max(B, G));
        }
        System.out.println(ans);
        if(A==ans)
            System.out.println("Adrian");
        if(B==ans)
            System.out.println("Bruno");
        if(G==ans)
            System.out.println("Goran");
    }
}