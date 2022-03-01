package silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_S3_2108 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int [n], numbers=new int[8005];
		double avg=0;
		int min=4001, max = -4001, maxcnt=0, maxi=0;
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			avg+=arr[i];
			
			numbers[arr[i]+4000]++;
			if(numbers[arr[i]+4000]>maxcnt) {
				maxcnt=numbers[arr[i]+4000];
				maxi=arr[i]+4000;
			}
			
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		Arrays.sort(arr);
		boolean chk=false;
		for(int i=0;i<=8000;i++) {
			if(numbers[i]==maxcnt) {
				
				if(chk) {
					maxi=i-4000;
					break;
				}
				maxi=i-4000;
				chk=true;
			}
		}
		System.out.println(Math.round(avg/n));
		System.out.println(arr[n/2]);
		System.out.println(maxi);
		System.out.println(max-min);
	}
}
