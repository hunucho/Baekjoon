import java.util.*;

public class Main {
    public static void main(String[] args) throws  Exception{
        Scanner sc = new Scanner(System.in);
        int t=1;
        while(true){
            int A=sc.nextInt();
            String oper=sc.next();
            int B=sc.nextInt();
            boolean sw = true;
            if(oper.equals("E"))
                break;

            System.out.printf("Case %d: %s\n", t++, f(A, oper, B)?"true":"false");
        }
    }
    static boolean f(int A, String op, int B){
        switch (op){
            case ">":  return A > B;
            case ">=": return A >= B;
            case "<":  return A < B;
            case "<=": return A <= B;
            case "==": return A == B;
            case "!=": return A != B;
        }
        return false;
    }
}