import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringTokenizer st1 = new StringTokenizer(sc.nextLine()), st2=new StringTokenizer(sc.nextLine());
        int A=0, B=0;
        for(int i=0;i<10;i++){
            int a=Integer.parseInt(st1.nextToken()), b=Integer.parseInt(st2.nextToken());
            if (a>b)
                A++;
            if (a<b)
                B++;
        }
        System.out.println(A==B?"D":A>B?"A":"B");
    }
}
