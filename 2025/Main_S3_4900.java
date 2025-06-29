import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> StoI = new HashMap<>();
        StoI.put("063",0);
        StoI.put("010",1);
        StoI.put("093",2);
        StoI.put("079",3);
        StoI.put("106",4);
        StoI.put("103",5);
        StoI.put("119",6);
        StoI.put("011",7);
        StoI.put("127",8);
        StoI.put("107",9);
        String [] ItoA = {"063","010","093","079","106","103","119","011","127","107"};
        StringBuilder sb = new StringBuilder();
        while(true){
            String S = br.readLine();
            if(S.compareTo("BYE")==0)
                break;
            StringTokenizer st = new StringTokenizer(S, "+");
            String A = st.nextToken(), B=st.nextToken();
            int a=0, b=0;
            for(int i=0;i<A.length();i+=3)
                a = a*10 + StoI.get(A.substring(i, i+3));
            for(int i=0;i<B.length()-1;i+=3)
                b = b*10 + StoI.get(B.substring(i, i+3));
            int c = a+b;
            String C = String.valueOf(c);
            sb.append(S);
            for(char ch : C.toCharArray())
                sb.append(ItoA[ch-'0']);
            sb.append("\n");
        }
        System.out.print(sb);
    }
}