import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int p=sc.nextInt(), w=sc.nextInt(), ans=0;
        int [] key = new int[] {1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 1, 2, 3, 4};
        int [] pause = new int [] {0,0,0,1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,5,6,6,6,7,7,7,7};
        sc.nextLine();
        String S = sc.nextLine();
        int last = -1;
        for(char ch : S.toCharArray()){
            if(ch==' ') {
                ans+=p;
                last =-1;
            }
            else {
                if(last == pause[ch-'A'])
                    ans+=w;
                ans += key[ch - 'A']*p;
                last = pause[ch-'A'];
            }
        }
        System.out.println(ans);
    }
}