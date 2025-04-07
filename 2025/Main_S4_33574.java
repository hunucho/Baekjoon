import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Q=Integer.parseInt(br.readLine()), lastidx=0, cnt=0;
        int [][] query = new int [Q][3];
        for(int i=0;i<Q;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;st.hasMoreTokens();j++)
                query[i][j]=Integer.parseInt(st.nextToken());
            if(query[i][0]==1)
                lastidx=i;
            else
                cnt++;
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<Q;i++){
            if(query[i][0]==2)
                al.add(query[i][1], query[i][2]);
            if(i==lastidx){
                if(query[i][1]==1)
                    Collections.sort(al);
                else
                    Collections.sort(al, Collections.reverseOrder());
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cnt).append("\n");
        for(int i=0;i<cnt;i++)
            sb.append(al.get(i)).append(" ");
        System.out.println(sb);

    }
}