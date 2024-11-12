import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(func(sc.nextLine()));
    }

    public static int func(String S){
        Stack<Character> s = new Stack<>();
        int ans=0, mul=1;
        for(int i=0;i<S.length();i++){
            char c=S.charAt(i);
            if(c==')'){
                if (s.isEmpty() || s.peek()!='(')
                    return 0;
                if(S.charAt(i-1)=='(')
                    ans += mul;
                s.pop();
                mul/=2;
            }
            else if(c==']'){
                if (s.isEmpty() || s.peek()!='[')
                    return 0;
                if(S.charAt(i-1)=='[')
                    ans += mul;
                s.pop();
                mul/=3;
            }
            else if (c=='(') {
                mul *= 2;
                s.push(c);
            }
            else if(c=='[') {
                mul *= 3;
                s.push(c);
            }
            else
                return 0;
        }
        return s.isEmpty()?ans:0;
    }
}
