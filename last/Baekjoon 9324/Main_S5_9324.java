import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<N;i++) {
            String M=sc.nextLine()+" ", ans="OK";
            int [] cnt = new int[26];
            for(int j=0;j<M.length()-1;j++){
                char ch = M.charAt(j);
                cnt[ch-'A']++;
                if(cnt[ch-'A']==3){
                    if(M.charAt(j+1)!=ch) {
                        ans = "FAKE";
                        break;
                    }
                    cnt[ch-'A']=0;
                    j++;
                }
            }
            System.out.println(ans);
        }
    }
}
