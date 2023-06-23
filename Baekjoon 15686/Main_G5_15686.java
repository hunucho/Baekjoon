import java.util.*;
import java.io.*;

public class Main {
	static int n, m, N, M, ans;
	static int [][] chickens, houses;
    public static void main(String[] args) throws Exception{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	N=Integer.parseInt(st.nextToken());
    	M=Integer.parseInt(st.nextToken());
    	ans=Integer.MAX_VALUE;
    	chickens = new int [13][2];
    	houses = new int [N*2][2];
    	for(int i=0;i<N;i++) {
    		st = new StringTokenizer(br.readLine());
    		for(int j=0;j<N;j++) {
    			int tmp=Integer.parseInt(st.nextToken());
    			if(tmp==1) {
    				houses[n][0]=i;
    				houses[n][1]=j;
    				n++;
    			} else if(tmp==2) {
    				chickens[m][0]=i;
    				chickens[m][1]=j;
    				m++;    				
    			}
    		}
    	}
    	System.out.println(combination(0, 0, new boolean [m]));
    }

    public static int getDistance(boolean [] chk) {
    	int sum = 0;
    	for(int i=0;i<n;i++) {
    		int tmp=Integer.MAX_VALUE;
    		for(int j=0;j<m;j++) {
    			if(chk[j]) { 
    				tmp = Math.min(tmp, Math.abs(houses[i][0]-chickens[j][0]) + Math.abs(houses[i][1]-chickens[j][1]));
    			}
    		}
    		sum+=tmp;
    	}
    	return sum;
    }
    
    public static int combination(int depth, int start, boolean [] chk) {
    	if(depth<M && !chk[start]) {
    		for(int i=start;i<=m-M+depth;i++) {
    			chk[i]=true;
    			combination(depth+1, i+1, chk);
    			chk[i]=false;
    		}
    	} else if(depth==M) {
    		ans = Math.min(ans, getDistance(chk));
    	}
    	return ans;
    }
}
