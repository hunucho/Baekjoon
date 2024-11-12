import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> s1 = new Stack<>(), s2 = new Stack<>();
        String S = br.readLine();
        for (char ch : S.toCharArray())
            s1.add(ch);
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String sw = st.nextToken();
            if (sw.equals("L")) {
                if (s1.size() > 0)
                    s2.add(s1.pop());
            } else if (sw.equals("D")) {
                if (s2.size() > 0)
                    s1.add(s2.pop());
            } else if (sw.equals("B")) {
                if (s1.size()>0)
                    s1.pop();
            }
            else if (sw.equals("P")) {
                s1.add(st.nextToken().charAt(0));
            }
        }
        while (s1.size() > 0)
            s2.add(s1.pop());
        StringBuilder sb = new StringBuilder();
        while (s2.size() > 0)
            sb.append(s2.pop());
        System.out.println(sb);
    }
}
