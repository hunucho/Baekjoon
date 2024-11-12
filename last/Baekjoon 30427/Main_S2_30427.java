import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> hs = new HashSet<>();
        br.readLine();
        int N=Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++) {
            String name = br.readLine();
            hs.add(name);
        }
        // case 1
        if(hs.contains("dongho")) {
            System.out.println("dongho");
            return;
        }
        int M=Integer.parseInt(br.readLine());
        for(int i=0;i<M;i++){
            String name = br.readLine();
            if(hs.contains(name))
                hs.remove(name);
        }
        // case 2
        if(hs.size()==0)
            System.out.println("swi");
        else if(hs.size()==1)
            System.out.println(hs.toArray()[0]);
        // case 3
        else if(hs.contains("bumin"))
            System.out.println("bumin");
        // case 4
        else if(hs.contains("cake"))
            System.out.println("cake");
            // case 4
        else if(hs.contains("lawyer"))
            System.out.println("lawyer");
        else {
            String [] suspects = hs.toArray(new String [hs.size()]);
            Arrays.sort(suspects);
            System.out.println(suspects[0]);
        }
    }
}