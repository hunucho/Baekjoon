import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int n=Integer.parseInt(br.readLine());
            if(n==0)
                break;
            HashMap<String, String> hm = new HashMap<>();
            String [] arr = new String [n];
            for(int i=0;i<n;i++){
                String S = br.readLine();
                hm.put(S.toLowerCase(), S);
                arr[i]=S.toLowerCase();
            }
            Arrays.sort(arr);
            System.out.println(hm.get(arr[0]));
        }
    }
}