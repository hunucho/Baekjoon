import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len=Integer.parseInt(br.readLine());
        String S = br.readLine();
        int cntp=0, cntc=0;
        for(char ch:S.toCharArray()){
            if(ch=='P')
                cntp++;
            else if(ch=='C')
                cntc++;
        }
        cntp=cntc= Math.min(cntp, cntc);
        for(char ch:S.toCharArray()){
            if(ch=='P' && cntc>0){
                System.out.print('C');
                cntc--;
            }
            else if(ch=='C' && cntp>0){
                System.out.print('P');
                cntp--;
            }
            else
                System.out.print(ch);
        }
    }
}