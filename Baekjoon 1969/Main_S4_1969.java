import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), M=sc.nextInt(), ansC=0;
        int [][] num = new int[M][26];
        String ansS="";
        for(int i=0;i<N;i++) {
            String S = sc.next();
            for(int j=0;j<M;j++){
                num[j][S.charAt(j)-'A']++;
            }
        }
        char [] DNA = new char [] {'A','C','G','T'};
        for(int i=0;i<M;i++){
            int tmp=9999;
            char tmpC='A';
            for(int j=0;j<4;j++) {
                if(tmp>N-num[i][DNA[j]-'A']){
                    tmp=N-num[i][DNA[j]-'A'];
                    tmpC=DNA[j];
                }
            }
            ansS+=tmpC;
            ansC+=tmp;
        }
        System.out.println(ansS+"\n"+ansC);

    }
}
