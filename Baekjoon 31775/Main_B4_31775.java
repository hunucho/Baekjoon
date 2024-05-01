import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean [] arr = new boolean [200];
        for(int i=0;i<3;i++)
        	arr[sc.nextLine().charAt(0)]=true;
    	System.out.println(arr['l']&&arr['k']&&arr['p']?"GLOBAL":"PONIX");
        		
    }
}
