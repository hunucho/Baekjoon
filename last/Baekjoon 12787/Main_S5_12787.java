import java.io.*;
import java.math.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int t=0;t<T;t++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M=Integer.parseInt(st.nextToken());
            if(M==1){
                String N=st.nextToken();
                StringTokenizer stN = new StringTokenizer(N,".");
                BigInteger bi = new BigInteger("0");
                while(stN.hasMoreTokens())
                    bi = bi.shiftLeft(8).add(new BigInteger(stN.nextToken()));
                bw.write(bi+"\n");
            } else if (M==2){
                BigInteger bi = new BigInteger(st.nextToken()), bit=new BigInteger("255");
                String ans="";
                for(int i=0;i<8;i++) {
                    ans = bi.and(bit) + "." + ans;
                    bi = bi.shiftRight(8);
                }
                bw.write(ans.substring(0,ans.length()-1)+"\n");
            }
        }
        bw.close();
    }
}

/*
2
1 255.255.255.255.255.255.255.255
2 18446744073709551615
 */
