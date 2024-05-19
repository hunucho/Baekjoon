import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        int len=str.length();
        boolean ans=true;
        for(int i=0;i<len/2;i++){
            if(str.charAt(i)!=str.charAt(len-i-1))
                ans=false;
        }
        System.out.println(ans?"true":"false");
    }
}