package silver;

import java.util.Scanner;

public class Main_S5_2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] croatian = new String[] { "c=", "c-","dz=", "d-", "lj", "nj", "s=", "z=" };
		int cnt = 0;
		for (int i = 0; i < croatian.length; i++) {
			for (int j = 0; j <= str.length() - croatian[i].length(); j++)
				if (str.substring(j, j + croatian[i].length()).equals(croatian[i])) {
					cnt++;
					str = str.replaceFirst(croatian[i], " ".repeat(croatian[i].length()));
				}
		}
		for (int i = 0; i < str.length(); i++)
			if (str.charAt(i) != ' ')
				cnt++;
		System.out.println(cnt);
	}

}
