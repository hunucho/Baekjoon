import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char [] arr = br.readLine().toCharArray();
        int ZERO=0, ONE=0;
        for(char ch:arr){
            if(ch=='0')
                ZERO++;
            else
                ONE++;
        }
        int zero=0, one=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='0' && zero<ZERO/2) {
                System.out.print("0");
                zero++;
            }
            else if(arr[i]=='1'){
                one++;
                if(one>ONE/2)
                    System.out.print("1");
            }
        }
    }
}