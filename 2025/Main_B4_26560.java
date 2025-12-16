import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            String S = br.readLine();
            System.out.print(S);
            if(S.charAt(S.length()-1)!='.')
                System.out.print(".");
            System.out.println();
        }
    }
}