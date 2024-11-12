import java.io.*;
import java.util.Scanner;

public class Main_B1_6996 {

    private static boolean solveAnagrams(String first, String second ) {
    	int [] arr = new int[26], brr=new int[26];
    	for(int i=0;i<first.length();i++)
    		arr[first.charAt(i)-'a']++;
    	for(int i=0;i<second.length();i++)
    		brr[second.charAt(i)-'a']++;
    	for(int i=0;i<26;i++)
    		if(arr[i]!=brr[i])
    			return false;
    	return true;        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTests = sc.nextInt();

        for (int i = 0; i < numTests; i++) {
            String first = sc.next().toLowerCase();
            String second = sc.next().toLowerCase();

            System.out.println(first + " & " + second + " are " + (solveAnagrams(first, second) ? "anagrams." : "NOT anagrams."));
        }
    }
}
