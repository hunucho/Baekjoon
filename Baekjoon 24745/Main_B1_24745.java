import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception{
        String [] alpha = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String [] num = {"-----",".----","..---","...--","....-",".....","-....","--...","---..","----."};
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        String mose = "";
        for(int i=0;i<str.length();i++) {
        	if(Character.isDigit(str.charAt(i)))
        		mose+=num[str.charAt(i)-'0'];
        	else if(Character.isAlphabetic(str.charAt(i)))
        		mose+=alpha[str.charAt(i)-'a'];
        }
        boolean ans=true;
        if(mose.length()==0)
        	ans=false;
        for(int i=0;i<mose.length()/2;i++)
        	if(mose.charAt(i)!=mose.charAt(mose.length()-1-i))
        		ans=false;
        System.out.println(ans?"YES":"NO");
    }
}

