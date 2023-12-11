import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++) {
            String S1=sc.next(), S2=sc.next();
            boolean chk=true;
            int [] arr = new int [26];
            for(char ch:S1.toCharArray())
                arr[ch-'a']++;
            for(char ch:S2.toCharArray())
                arr[ch-'a']--;
            for(int i=0;i<26;i++)
                if(arr[i]!=0)
                    chk=false;
            System.out.println(chk?"Possible":"Impossible");
        }
    }
}
