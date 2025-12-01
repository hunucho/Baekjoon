import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double T=Double.parseDouble(br.readLine());
        System.out.print(Math.round(Math.pow(T/2,2)));
    }
}