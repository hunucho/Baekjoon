import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int N = Integer.parseInt(br.readLine());
    	int [] arr = new int [N*N];
    	for(int i=0;i<N;i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		for(int j=0;j<N;j++)
    			arr[i*N+j]=Integer.parseInt(st.nextToken());
    	}
    	Arrays.sort(arr);
    	System.out.println(arr[N*N-N]);
    }
}
