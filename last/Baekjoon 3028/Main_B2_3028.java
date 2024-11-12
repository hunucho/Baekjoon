import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ans=0;
        for(char ch : str.toCharArray()) {
            if(ch=='A' && ans!=2)
                ans=1-ans;
            else if(ch=='B' && ans!=0)
                ans=3-ans;
            else if(ch=='C' && ans!=1)
                ans=2-ans;
        }
        System.out.println(ans+1);

        /*
        A
        0 -> 1
        1 -> 0

        B
        1 -> 2
        2 -> 1

        C
        0 -> 2
        2 -> 0
         */
    }
}
