import java.util.*;

public class Main_B2_2592 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [101];
		int avg=0, max=0, mode=0;
		for(int i=0;i<10;i++) {
			int tmp=sc.nextInt();
			avg+=tmp;
			arr[tmp/10]++;
		}
		for(int i=0;i<=100;i++) {
			if(arr[i]>max) {
				mode=i*10;
				max=arr[i];
			}
		}
		System.out.println(avg/10+"\n"+mode);
	}
}
