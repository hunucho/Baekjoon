import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str="";
        while((str = br.readLine())!=null){
            if(str.isBlank())
                break;
            char[] arr = str.toCharArray();
            for (char c : arr) {
                if (c == 'e') sb.append('i');
                else if (c == 'i') sb.append('e');
                else if (c == 'E') sb.append('I');
                else if (c == 'I') sb.append('E');
                else sb.append(c);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}