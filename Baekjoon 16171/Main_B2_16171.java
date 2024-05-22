import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String S=sc.nextLine();
        String K=sc.nextLine();
        for(int i=0;i<=9;i++)
        	S=S.replaceAll(String.valueOf(i), "");
        System.out.println(S.contains(K)?1:0);
    }
}

