import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long T=Long.parseLong(br.readLine());
		for(int t=0;t<T;t++) {
			long n=Long.parseLong(br.readLine());
			Inte
			if(n<3) {
				System.out.println(2);
				continue;
			}
			for(long i=n;i<=2*n;i++) {
				if(isPrime(i)) {
					System.out.println(i);
					break;
				}
			}
		}	
	}
	public static boolean isPrime(long n) {		
		for(int i=2;i<=(long)Math.sqrt(n);i++)
			if(n%i==0)
				return false;
		return true;
	}
}
