import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        st.nextToken();
        int N=Integer.parseInt(st.nextToken());
        Stack<String> back = new Stack<>(), front = new Stack<>();
        String cur ="";
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            char cmd = st.nextToken().charAt(0);
            if(cmd=='B') {
                if(back.size()>0){
                    front.add(cur);
                    cur=back.pop();
                }
            } else if(cmd=='F') {
                if(front.size()>0) {
                    back.add(cur);
                    cur = front.pop();
                }
            } else if(cmd == 'A'){
                front.clear();
                if(cur.length()>0)
                    back.add(cur);
                cur=st.nextToken();
            }else if(cmd =='C'){
                Stack<String> compress = new Stack<>();
                compress.add("none");
                while(back.size()>0){
                    String tmp = back.pop();
                    if(tmp.compareTo(compress.peek())!=0)
                        compress.push(tmp);
                }
                while(compress.size()>1)
                    back.add(compress.pop());
            }
        }
        System.out.println(cur);
        if(back.size()>0) {
            while (back.size() > 0)
                System.out.print(back.pop() + " ");
            System.out.println();
        }
        else
            System.out.println("-1");
        if(front.size()>0){
            while(front.size()>0)
                System.out.print(front.pop()+" ");
            System.out.println();
        }
        else
            System.out.println("-1");
    }
}
