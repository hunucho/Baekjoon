import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R=Integer.parseInt(st.nextToken()), C=Integer.parseInt(st.nextToken());
        char [][] arr = new char[R][C];
        PriorityQueue<String> pq = new PriorityQueue<>();
        for(int i=0;i<R;i++)
            arr[i]=br.readLine().toCharArray();
        for(int i=0;i<R;i++){
            String tmp="";
            for(int j=0;j<C;j++){
                if(arr[i][j]=='#') {
                    if(tmp.length()>=2)
                        pq.add(tmp);
                    tmp="";
                }
                else
                    tmp+=arr[i][j];
            }
            if(tmp.length()>=2)
                pq.add(tmp);
        }
        for(int j=0;j<C;j++){
            String tmp="";
            for(int i=0;i<R;i++){
                if(arr[i][j]=='#') {
                    if(tmp.length()>=2)
                        pq.add(tmp);
                    tmp="";
                }
                else
                    tmp+=arr[i][j];
            }
            if(tmp.length()>=2)
                pq.add(tmp);
        }
        System.out.println(pq.peek());
    }
}