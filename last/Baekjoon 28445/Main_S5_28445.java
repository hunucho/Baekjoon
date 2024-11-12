import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String [] color = new String [4];
		for(int i=0;i<4;i++)
			color[i]=sc.next();
		TreeSet<String> ts = new TreeSet<>();
		for(int i=0;i<4;i++)
			for(int j=0;j<4;j++)
				ts.add(color[i]+" "+color[j]);
		while(ts.size()>0)
			System.out.println(ts.pollFirst());
	}
}
