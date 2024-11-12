import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len=str.length(), ans=1;
        char last = ' ';
        for(int i=0;i<len;i++){
            char ch = str.charAt(i);
            if(ch=='d'){
                if(last == 'd')
                    ans*= 9;
                else
                    ans*= 10;
            }
            else if(ch=='c'){
                if(last=='c')
                    ans*=25;
                else
                    ans*=26;
            }
            last=ch;
        }
        System.out.println(ans);
    }
}