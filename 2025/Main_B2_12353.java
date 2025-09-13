import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws  Exception{
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=0;t<T;t++){
            String sex = sc.next();
            String father = sc.next(), mother = sc.next();
            int ff = Integer.parseInt(father.substring(0, 1));
            int fi = Integer.parseInt(father.substring(2, father.indexOf("\"")));
            int mf = Integer.parseInt(mother.substring(0, 1));
            int mi = Integer.parseInt(mother.substring(2, mother.indexOf("\"")));
            double prediction = ff*12+fi+mf*12+mi;
            if(sex.equals("B"))
                prediction+=5;
            else
                prediction-=5;
            prediction/=2;
            System.out.printf("Case #%d: %d\'%d\" to %d\'%d\"\n",
                    t+1, (int)Math.ceil(prediction-4)/12, (int)Math.ceil(prediction-4)%12,
                    (int)Math.floor(prediction+4)/12, (int)Math.floor(prediction+4)%12);
        }
    }
}
/*
2
G 1'0" 1'0"
B 1'0" 1'0"

Case #1: 0'6" to 1'1"
Case #2: 0'11" to 1'6"
 */