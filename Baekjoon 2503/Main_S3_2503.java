import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt(), ans=0;
        sc.nextLine();
        char [][] Q = new char[N][7];
        for(int i=0;i<N;i++)
            Q[i]=sc.nextLine().toCharArray();
        for(int i=123;i<=987;i++) {
            char [] M=String.valueOf(i).toCharArray();
            boolean chk=true;
            if(M[0]=='0' || M[1]=='0' || M[2]=='0' || M[0]==M[1] || M[1]==M[2] || M[2]==M[0])
                continue;
            for(int j=0;j<N;j++){
                int strike=0, ball=0;
                for(int k=0;k<3;k++){
                    if(Q[j][k]==M[k])
                        strike++;
                    else if(Q[j][k]==M[(k+1)%3] || Q[j][k]==M[(k+2)%3])
                        ball++;
                }
                if(Q[j][4]-'0'!=strike || Q[j][6]-'0'!=ball)
                    chk = false;
            }
            if(chk)
                ans++;
        }
        System.out.println(ans);
    }
}
