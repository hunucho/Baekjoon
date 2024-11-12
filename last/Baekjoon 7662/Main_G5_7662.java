package gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main_G5_7662 {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine()); // for test case
		for (int test = 0; test < t; test++) {
			TreeMap<Integer, Integer> tm = new TreeMap<>(); // each test case has their own TreeMap
			int k = Integer.parseInt(br.readLine()); // how many elements they have
			for (int i = 0; i < k; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine()); // each operator
				String sw = st.nextToken();
				int num = Integer.parseInt(st.nextToken());
				if (sw.equals("I")) { // when operator is Insert, checking whether it's existing
					if (tm.containsKey(num))
						tm.put(num, tm.get(num) + 1); // get value of num and add 1, put the value added 1
					else
						tm.put(num, 1);		// add num to TreeMap with 1 as a value;
				} else if (sw.equals("D")) {	// when operator is Delete
					if (tm.size() == 0)	// if the size of TreeMap is 0, ignore the command
						continue;
					else {
						if (num == 1) {	// if it asks max value
							int maxkey = tm.lastKey();	// get a maxkey from TreeMap
							if (tm.get(maxkey) == 1)	// if the value of maxkey is 1, there is only an element, delete the entry from TreeMap
								tm.remove(maxkey);
							else
								tm.put(maxkey, tm.get(maxkey) - 1);	// if the value is bigger than 1, it has duplicated keys, decrease 1
						} else if (num == -1) {
							int minkey = tm.firstKey();
							if (tm.get(minkey) == 1)
								tm.remove(minkey);
							else
								tm.put(minkey, tm.get(minkey) - 1);
						}
					}
				}
			}
			if (tm.size() == 0)
				bw.write("EMPTY\n");
			else
				bw.write(tm.lastKey() + " " + tm.firstKey()+"\n");
		}
		bw.close();
	}
}
