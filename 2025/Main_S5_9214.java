import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t=1;
        while(true){
            String n = br.readLine();
            if(n.compareTo("0")==0)
                break;
            HashSet<String> hs = new HashSet<>();

            while(!hs.contains(n)){
                hs.add(n);
                String m = "";
                if(n.length()%2==1)
                    break;
                for(int i=0;i<n.length();i+=2){
                    int rep = n.charAt(i)-'0';
                    char num = n.charAt(i+1);
                    m+=String.valueOf(num).repeat(rep);
                }
                n=m;
            }
            sb.append("Test "+ t++ +": "+n+"\n");
        }
        System.out.println(sb.toString());
    }
}