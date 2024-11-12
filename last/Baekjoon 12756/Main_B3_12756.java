import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aa=sc.nextInt(), ah=sc.nextInt(), ba=sc.nextInt(), bh=sc.nextInt();
        String ans="";
        while(ah>0 && bh>0){
            ah-=ba;
            bh-=aa;
        }
        if(ah<=0 && bh<=0)
            ans="DRAW";
        else if(ah>bh)
            ans="PLAYER A";
        else if(ah<bh)
            ans="PLAYER B";
        System.out.println(ans);
    }
}
