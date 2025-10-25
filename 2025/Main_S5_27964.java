import java.util.*;
import java.io.*;
import java.util.regex.Pattern;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<String> hs = new HashSet<>();
        Pattern pt = Pattern.compile("[A-Za-z]*Cheese$");
        for(int i=0;i<N;i++){
            String S = st.nextToken();
            if(pt.matcher(S).matches())
                hs.add(S);
        }
        System.out.print(hs.size()>=4?"yummy":"sad");
    }
}