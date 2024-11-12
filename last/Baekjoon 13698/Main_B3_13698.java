import java.io.*;
import java.util.*;

class Main {
	static int [] arr = {1, 0, 0, 2};
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String S=sc.next();
		for(char ch:S.toCharArray()) {
			if(ch=='A')
				swap(0, 1);
			else if(ch=='B')
				swap(0, 2);
			else if(ch=='C')
				swap(0, 3);
			else if(ch=='D')
				swap(1, 2);
			else if(ch=='E')
				swap(1, 3);
			else if(ch=='F')
				swap(2, 3);
		}
		int big=0, small=0;
		for(int i=0;i<4;i++)
			if(arr[i]==1)
				small=i+1;
			else if(arr[i]==2)
				big=i+1;
		System.out.println(small+"\n"+big);
		
	}
	public static void swap(int a, int b) {
		int tmp=arr[a];
		arr[a]=arr[b];
		arr[b]=tmp;
	}
}
