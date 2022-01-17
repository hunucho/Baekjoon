package silver;

public class Main_S5_4673 {
	static boolean[] arr = new boolean[20005];
	public static void main(String[] args) {
		for(int i=1;i<=10000;i++)
			d(i);
		for(int i=1;i<=10000;i++)
			if(arr[i]==false)
				System.out.println(i);
	}
	public static void d(int i) {
		int temp=i, sum=0;
		sum=temp;
		if(temp<=10000 && arr[temp]==false) {
			while(temp>0) {
			sum+=temp%10;
			temp/=10;
			}
			
			d(sum);
			arr[sum]=true;
		}
		
	}
}
