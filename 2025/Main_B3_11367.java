import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int t=0;t<n;t++){
            String name=sc.next();
            int score=sc.nextInt();
            System.out.printf("%s %s\n", name, score>=97?"A+":score>=90?"A":score>=87?"B+":score>=80?"B":score>=77?"C+":score>=70?"C":score>=67?"D+":score>=60?"D":"F");
        }
    }
}