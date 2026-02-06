import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String S = br.readLine();
            if(S.equals("end"))
                break;
            if(S.charAt(0)=='a')
                sb.append("Panthera tigris\n");
            else if(S.charAt(0)=='f')
                sb.append("Forsythia koreana\n");
            else if(S.charAt(0)=='t')
                sb.append("Pinus densiflora\n");
        }
        System.out.print(sb);
    }
}