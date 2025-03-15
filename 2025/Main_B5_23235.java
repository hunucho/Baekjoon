import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str="";
        int i=1;
        while((str = br.readLine()).compareTo("0")!=0)
            System.out.printf("Case %d: Sorting... done!\n", i++);
    }
}