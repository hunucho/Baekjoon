import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

class Main {
    static HashMap<Long, Long> hm;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N=Integer.parseInt(br.readLine());
        String [] guitar = new String[N];
        for(int i=0;i<N;i++)
            guitar[i]= br.readLine();



        Arrays.sort(guitar, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()-o2.length()!=0)
                    return o1.length()-o2.length();
                else{
                    int a=0, b=0;
                    for(int i=0;i<o1.length();i++) {
                        if (Character.isDigit(o1.charAt(i)))
                            a += o1.charAt(i) - '0';
                        if (Character.isDigit(o2.charAt(i)))
                            b += o2.charAt(i) - '0';
                    }
                    if(a!=b)
                        return a-b;
                }
                return o1.compareTo(o2);
            }
        });

        for(int i=0;i<N;i++)
            sb.append(guitar[i]+"\n");
        System.out.println(sb.toString());
    }
}