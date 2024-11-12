import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] nums = new int [N];
        int M = Integer.parseInt(br.readLine()), min=0, max=-1;
        for(int i=0;i<N;i++) {
        	nums[i]=Integer.parseInt(st.nextToken());
        	max=Math.max(max, nums[i]);
        }
        
        while(min<=max) {
        	int mid = (min+max)/2, s=0;
        	for(int i=0;i<N;i++)
        		s+=Math.min(nums[i], mid);
        	if(s<=M) {
        		min=mid+1;
        	} else {
        		max=mid-1;
        	}
        }
        System.out.println(max);
    }
}
