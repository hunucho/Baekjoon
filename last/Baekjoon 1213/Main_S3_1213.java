package silver;

import java.util.*;

public class Main_S3_1213 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		int odd=0, len=str.length(), k=0;
		char [] arr = new char [26], brr=new char[len];
		for(int i=0;i<len;i++)
			arr[str.charAt(i)-'A']++;
		for(int i=0;i<26;i++)
			if(arr[i]%2==1)
				odd++;
		if(odd>=2 || len==0) {
			System.out.println("I'm Sorry Hansoo");
			return;
		}
		for(int i=0;i<26;i++) {
			while(arr[i]>1) {
				brr[k]=brr[len-k-1]=(char)('A'+i);
				k++;
				arr[i]-=2;
			}
			if(arr[i]==1)
				brr[len/2]=(char)('A'+i);
		}
		System.out.println(String.valueOf(brr));
	}
}
