import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        String S = br.readLine();
        int ans=0;
        for(int i=0;i<N-1;i++){
            if(S.charAt(i)==S.charAt(i+1) &&(S.charAt(i)=='5' || S.charAt(i)=='2'))
                ans+=2;
            else if(S.charAt(i)==']' && S.charAt(i+1)=='[')
                ans+=0;
            else
                ans++;
        }
        System.out.print(ans);
    }
}

/*

[ 5 2 ]
[[      1
[5      1
[2      1
[]      1

5[      1
55      2
52      1
5]      1

2[      1
25      1
22      2
2]      1

][      0
]5      1
]2      1
]]      1


 */