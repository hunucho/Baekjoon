import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int T = Integer.parseInt(br.readLine());
    	for(int t=0;t<T;t++) {
    		int n=Integer.parseInt(br.readLine()), ans=0;
    		int [][] arr = new int [2][n], brr = new int [2][n+2];
    		for(int i=0;i<2;i++) {
    			StringTokenizer st = new StringTokenizer(br.readLine());
    			for(int j=0;j<n;j++)
    				arr[i][j]=Integer.parseInt(st.nextToken());
    		}
    		for(int j=0;j<n;j++) {
    			brr[0][j+2]=Math.max(brr[1][j+1], Math.max(brr[0][j], brr[1][j]))+arr[0][j];
    			brr[1][j+2]=Math.max(brr[0][j+1], Math.max(brr[0][j], brr[1][j]))+arr[1][j];
    		}
    		System.out.println(Math.max(brr[0][n+1],brr[1][n+1]));
    	}    	
    }
}
