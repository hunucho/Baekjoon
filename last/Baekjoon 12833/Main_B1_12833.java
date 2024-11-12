import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		StringTokenizer st = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
		int A=Integer.parseInt(st.nextToken()), B=Integer.parseInt(st.nextToken()), C=Integer.parseInt(st.nextToken());
		System.out.println(C%2==1?A^B:A);
	}
}
