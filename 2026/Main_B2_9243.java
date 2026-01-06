import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(f(Integer.parseInt(br.readLine()), br.readLine(), br.readLine())?"Deletion succeeded":"Deletion failed");
    }

    static boolean f(int N, String A, String B){
        if(N%2==1){
            for(int i=0;i<A.length();i++){
                if(A.charAt(i)==B.charAt(i))
                    return false;
            }
        } else {
            for(int i=0;i<A.length();i++){
                if(A.charAt(i)!=B.charAt(i))
                    return false;
            }
        }

        return true;
    }
}