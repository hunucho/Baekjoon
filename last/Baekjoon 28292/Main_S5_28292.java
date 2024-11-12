import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println(N<3?1:N<6?2:3);
//        Scanner sc = new Scanner(System.in);
//        int N=sc.nextInt();
//        String str = "1";
//        for(int k=1;k<N;k++) {
//            char prev=str.charAt(0);
//            int cnt=1;
//            String newStr = "";
//            for (int i = 1; i < str.length(); i++) {
//                if(prev!=str.charAt(i)) {
//                    newStr += prev+""+cnt;
//                    cnt = 1;
//                    prev = str.charAt(i);
//                } else
//                    cnt++;
//            }
//            str=newStr+""+prev+""+cnt;
//        }
//        char max='0';
//        for(char ch:str.toCharArray())
//            max=max<ch?ch:max;
//        System.out.println(max);
    }
}
