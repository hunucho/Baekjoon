import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int L=Integer.parseInt(br.readLine());
        for(int i=0;i<L;i++) {
            LinkedList<Character> ll = new LinkedList<>();
            String S=br.readLine();
            int index=0;
            for(char ch:S.toCharArray()){
                if(ch=='<') {
                    index--;
                    index = Math.max(0, index);
                } else if(ch=='>') {
                    index++;
                    index = Math.min(index, ll.size());
                } else if(ch=='-') {
                    if (index != 0) {
                        ll.remove(index - 1);
                        index--;
                    }
                }
                else {
                    ll.add(index, ch);
                    index++;
                }
            }
            for(char ch:ll)
                sb.append(ch);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}