import java.util.Scanner;

public class Main_B2_25501 {
	static int n=0;
	public static int recursion(String s, int l, int r){
		n++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int T=sc.nextInt();
    	sc.nextLine();
    	for(int i=0;i<T;i++) {
    		String S = sc.nextLine();
    		System.out.println(isPalindrome(S)+" "+n);
    		n=0;
    	}
    }
}
