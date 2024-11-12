public class Main {
	public static void main(String[] args) {
		for(int i=2992;i<=9999;i++) {
			int a=f(Integer.toString(i)), b=f(Integer.toString(i,12)), c=f(Integer.toString(i,16));
			if(a==b && b==c)
				System.out.println(i);
		}
	}
	public static int f (String s) {
		int a=0;
		for(char c:s.toCharArray()) {
			if(c>='a')
				a+=c-'a'+10;
			else
				a+=c-'0';
		}
		return a;
	}
}
