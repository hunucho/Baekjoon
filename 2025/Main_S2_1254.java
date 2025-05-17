import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char [] S = br.readLine().toCharArray();
        int len=S.length, ans=S.length*2;
        for(int i=0;i<len;i++){
            int cnt=0;
            for(int j=0;i+j<len || i-j>=0;j++){
                if(i+j>=len)
                    cnt++;
                else if (i-j<0 || S[i-j]!=S[i+j]) {
                    cnt = 999;
                    break;
                }
            }
            ans=Math.min(ans, len+cnt);
            cnt=0;
            for(int j=0;i+j+1<len || i-j>=0;j++){
                if(i+j+1>=len)
                    cnt++;
                else if(i-j<0 || S[i-j]!=S[i+j+1]){
                    cnt=999;
                    break;
                }
            }

            ans=Math.min(ans, len+cnt);
        }
        System.out.print(ans);
    }
}