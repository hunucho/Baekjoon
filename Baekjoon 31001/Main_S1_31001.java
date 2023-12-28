import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long M = sc.nextLong();
		int Q = sc.nextInt();
		HashMap<String, Long> prices = new HashMap<>(), wallet = new HashMap<>();
		HashSet<String>[] groups = new HashSet[101];
		for (int i = 1; i <= 100; i++)
			groups[i] = new HashSet<String>();
		for (int i = 0; i < N; i++) {
			int g = sc.nextInt();
			String name = sc.next();
			long price = sc.nextLong();
			groups[g].add(name);
			prices.put(name, price);
		}
		for (int i = 0; i < Q; i++) {
			int sw = sc.nextInt();
			if (sw == 1) {
				String A = sc.next();
				int B = sc.nextInt();
				if (prices.get(A) * B <= M) {
					wallet.put(A, wallet.getOrDefault(A, (long) 0) + B);
					M -= prices.get(A) * B;
				}
			} else if (sw == 2) {
				String A = sc.next();
				int B = sc.nextInt();
				M += prices.get(A) * Math.min(wallet.getOrDefault(A, (long) 0), B);
				wallet.put(A, wallet.getOrDefault(A, (long) 0) - Math.min(wallet.getOrDefault(A, (long) 0), B));
			} else if (sw == 3) {
				String A = sc.next();
				int C = sc.nextInt();
				prices.put(A, prices.get(A) + C);
			} else if (sw == 4) {
				int D = sc.nextInt(), C = sc.nextInt();
				Iterator iter = groups[D].iterator();
				while (iter.hasNext()) {
					String key = iter.next().toString();
					prices.put(key, Math.max(prices.get(key) + C, 0));
				}
			} else if (sw == 5) {
				int D = sc.nextInt(), E = sc.nextInt();
				Iterator iter = groups[D].iterator();
				while (iter.hasNext()) {
					String key = iter.next().toString();
					prices.put(key, (prices.get(key) * (100 + E) / 1000)*10);
				}
			} else if (sw == 6) {
				System.out.println(M);
			} else if (sw == 7) {
				long tmp = 0;
				Iterator iter = wallet.keySet().iterator();
				while (iter.hasNext()) {
					String key = iter.next().toString();
					tmp += prices.get(key) * wallet.get(key);
				}
				System.out.println(M + tmp);
			}

		}
	}
}
