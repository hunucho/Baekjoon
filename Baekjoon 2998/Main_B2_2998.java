import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N=sc.next();
        String [] nums = {"000", "001","010","011","100","101","110","111"};
        if(N.length()%3==1)
            N="00"+N;
        else if(N.length()%3==2)
            N="0"+N;
        for(int i=0;i<N.length();i+=3){
            for(int j=0;j<8;j++){
                if(N.substring(i, i+3).compareTo(nums[j])==0) {
                    System.out.print(j);
                    break;
                }
            }
        }
    }
}