import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while((str = br.readLine())!=null) {
			while(str.matches(".*BUG.*"))
				str=str.replaceAll("BUG", "");
			System.out.println(str);
		}
	}
}
