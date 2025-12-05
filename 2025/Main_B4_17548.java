import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        if(S.equals("Later!"))
            System.out.print("Alligator!");
        else
            System.out.print(S.replaceAll("e","ee"));
    }
}