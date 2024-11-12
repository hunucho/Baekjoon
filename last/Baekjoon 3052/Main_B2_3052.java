package Bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main_B2_3052 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<Integer> value_set = new HashSet<Integer>();	// using set, to eliminate duplication
		for(int i=0;i<10;i++)
			value_set.add(Integer.parseInt(br.readLine())%42);
		System.out.println(value_set.size());
	}
}
