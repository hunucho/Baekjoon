import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws  Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<Integer> prime = new ArrayList<>();
        for(int n=0;n<N;n++){
            long S=sc.nextLong();
            String ans="YES";
            for(int i=2;i<=1000001;i++) {
                if (S % i == 0) {
                    ans = "NO";
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
