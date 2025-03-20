import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int S=Integer.parseInt(br.readLine()), F=Integer.parseInt(br.readLine());
        System.out.println(S>F?"flight":"high speed rail");
    }
}