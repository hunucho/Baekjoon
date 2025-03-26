import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String [] ANS = {"in-out", "out-in", "stairs", "reverse", "molu"};
        int ans=4;
        if(S.compareTo("fdsajkl;")==0 || S.compareTo("jkl;fdsa")==0)
            ans=0;
        else if(S.compareTo("asdf;lkj")==0 || S.compareTo(";lkjasdf")==0)
            ans=1;
        else if(S.compareTo("asdfjkl;")==0)
            ans=2;
        else if(S.compareTo(";lkjfdsa")==0)
            ans=3;
        System.out.println(ANS[ans]);
    }
}