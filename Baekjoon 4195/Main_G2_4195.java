import java.io.*;
import java.util.*;

class Main
{
	static HashMap<String, Integer> name;
	static int [] parent, friend;
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T=Integer.parseInt(br.readLine());
		for(int t=0;t<T;t++) {
			name = new HashMap<>();
			parent = new int [200005];
			friend = new int [200005];

			int seq=0, F=Integer.parseInt(br.readLine());
			int pa=0, pb=0;
			
			for(int i=0;i<F;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String a = st.nextToken(), b = st.nextToken();
				if(!name.containsKey(a)) {
					friend[seq]=1;
					parent[seq] = seq;
					pa=seq;
					name.put(a, seq++);
				} else {
					pa = find(name.get(a));
				}
				
				if(!name.containsKey(b)) {
					friend[seq]=1;
					parent[seq] = seq;
					pb=seq;
					name.put(b, seq++);
				} else {
					pb = find(name.get(b));
				}
				
				if(pa!=pb)
					union(pa, pb);
				sb.append(friend[Math.min(pa, pb)]+"\n");
			}	
		}				
		System.out.println(sb.toString());
	}
	
	public static int find(int node) {
		if(node == parent[node])
			return node;
		return parent[node]=find(parent[node]);
	
	}
	
	public static void union(int pa, int pb) {
		parent[Math.max(pa, pb)] = Math.min(pa, pb);
		
		friend[Math.min(pa, pb)] += friend[Math.max(pa, pb)];
		friend[Math.max(pa, pb)] = 0;
	}
}
