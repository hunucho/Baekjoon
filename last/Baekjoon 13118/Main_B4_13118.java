import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] p = new int[4];
        for(int i=0;i<4;i++)
            p[i]=sc.nextInt();
        int x=sc.nextInt(), y=sc.nextInt(), r=sc.nextInt();
        int ans=0;
        for(int i=0;i<4;i++)
            if(p[i]==x)
                ans=i+1;
        System.out.println(ans);
    }
}