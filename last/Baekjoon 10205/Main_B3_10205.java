import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int K=sc.nextInt();
        for(int k=1;k<=K;k++) {
            int h=sc.nextInt();
            String S=sc.next();
            for(char s:S.toCharArray())
                h+=s=='c'?1:-1;
            System.out.println("Data Set "+k+":\n"+h+"\n");
        }
    }
}
