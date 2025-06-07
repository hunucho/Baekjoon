import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A=br.readLine(), B=br.readLine();
        String a = getSyllable(A), b = getSyllable(B);
        if(a!="" && b!="")
            System.out.print(a+b);
        else
            System.out.print("no such exercise");
    }
    public static String getSyllable(String S) {
        int ret = 0;
        boolean chk = false;
        for(int i=0;i<S.length();i++){
            char ch = S.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                chk=true;
            else if(chk){
                ret = i;
                break;
            }
        }
        return S.substring(0, ret);
    }
}