import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String plain = sc.nextLine(), key=sc.nextLine();
        for(int i=0;i<plain.length();i++){
            if(plain.charAt(i)!=' ')
                sb.append((char)(((25+((plain.charAt(i)-'a') - (key.charAt(i%key.length()) -'a')))%26)+'a'));
            else
                sb.append(" ");
        }
        System.out.println(sb.toString());

    }
}