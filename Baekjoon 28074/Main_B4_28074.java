import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean [] arr = new boolean [26];
        for(char ch:str.toCharArray())
            arr[ch-'A']=true;
        boolean ans=true;
        for(char ch:"MOBIS".toCharArray()){
            if(!arr[ch-'A'])
                ans=false;
        }
        System.out.println(ans?"YES":"NO");
    }
}