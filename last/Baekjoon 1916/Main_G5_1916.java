import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine()), M=Integer.parseInt(br.readLine());
        final int MAX = 1234567890;
        int [] dist = new int [N+1], visited = new int [N+1];
        Arrays.fill(dist, MAX);
        int [][] bus = new int[N+1][N+1];
        for(int i=1;i<=N;i++) {
            Arrays.fill(bus[i], MAX);
            bus[i][i]=0;
        }
        for(int i=0;i<M;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int from=Integer.parseInt(st.nextToken()), to=Integer.parseInt(st.nextToken()), cost = Integer.parseInt(st.nextToken());
            if(bus[from][to]>cost)
                bus[from][to]=cost;
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int FROM=Integer.parseInt(st.nextToken()), TO=Integer.parseInt(st.nextToken());
        visited[FROM]=1;
        for(int i=1;i<=N;i++)
            dist[i]=bus[FROM][i];
        for(int i=1;i<=N;i++){
            int cur =0;
            int min=MAX;
            for(int j=1;j<=N;j++){
                if(dist[j]<min && visited[j]==0) {
                    min = dist[j];
                    cur = j;
                }
            }
            visited[cur]=1;
            for(int j=1;j<=N;j++){
                if(visited[j]==0){
                    if(dist[cur]+bus[cur][j]<dist[j])
                        dist[j]=dist[cur]+bus[cur][j];
                }
            }
        }
        System.out.println(dist[TO]);
    }

}