import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N=0;
        for(int i=0;i<3;i++){
            String S=sc.nextLine();
            if(Character.isDigit(S.charAt(0))){
                N=Integer.parseInt(S)+3-i;
            }
        }
        System.out.println(N%3==0?N%5==0?"FizzBuzz":"Fizz":N%5==0?"Buzz":N);
    }
}