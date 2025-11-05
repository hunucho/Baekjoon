import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine(), B = br.readLine();
        StringBuilder sb = new StringBuilder();
        if(A.compareTo("null")==0){
            sb.append("NullPointerException\nNullPointerException");
        } else if(B.compareTo("null")==0){
            sb.append("false\nfalse");
        }else{
            sb.append(A.equals(B)?"true":"false").append("\n");
            sb.append(A.equalsIgnoreCase(B)?"true":"false");
        }
        System.out.print(sb);
    }
}