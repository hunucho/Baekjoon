import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [][] arr = new String[9][9];
        for(int i=0;i<9;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0;j<9;j++)
                arr[i][j]=st.nextToken();
        }
        PriorityQueue<String> mid = new PriorityQueue<>();
        for(int i=3;i<6;i++){
            for(int j=3;j<6;j++) {
                if(!(i==4 && j==4))
                    mid.add(arr[i][j]);
            }
        }
        int cnt=1;
        while(mid.size()>0){
            for(int i=1;i<9;i+=3){
                for(int j=1;j<9;j+=3){
                    if(mid.size()>0 && mid.peek().compareTo(arr[i][j])==0){
                        PriorityQueue<String> detail = new PriorityQueue<>();
                        for(int k=-1;k<2;k++){
                            for(int l=-1;l<2;l++)
                                if(!(k==0 && l==0))
                                    detail.add(arr[i+k][j+l]);
                        }
                        System.out.printf("#%d. %s\n",cnt, mid.poll());
                        int detailcnt=1;
                        while(detail.size()>0)
                            System.out.printf("#%d-%d. %s\n",cnt, detailcnt++, detail.poll());
                        cnt++;
                    }
                }
            }
        }
    }
}