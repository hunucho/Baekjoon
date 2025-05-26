import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++){
            String n=sc.next();
            int [] num = new int [10];
            for(char ch:n.toCharArray()) {
                if(ch=='6')
                    num[9]++;
                else
                    num[ch - '0']++;
            }
            long a=0, b=0;
            for(int i=9;i>=0;i--){
                for(int j=0;j<num[i];j++){
                    if(a<b)
                        a=a*10+i;
                    else
                        b=b*10+i;
                }
            }
            System.out.println(a*b);
        }
    }
}