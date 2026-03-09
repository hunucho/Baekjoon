import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String S = st.nextToken();
        int N = Integer.parseInt(st.nextToken());
        int [] ch = new int[150];
        for(int i='A';i<='z';i++)
            ch[i]=i;

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int sw = Integer.parseInt(st.nextToken());
            if(sw==1){
                char from = st.nextToken().charAt(0), to = st.nextToken().charAt(0);
                for(int j='A';j<='z';j++){
                    if(ch[j]==from)
                        ch[j]=to;
                }
            }
            else {
                for(int c:S.toCharArray()) {
                    bw.write(ch[c]);
                }
                bw.write("\n");
                bw.flush();
            }
        }
        bw.close();
    }
}
