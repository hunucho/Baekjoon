import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int X1=sc.nextInt(), Y1=sc.nextInt(), R1=sc.nextInt();
        int X2=sc.nextInt(), Y2=sc.nextInt(), R2=sc.nextInt();
        System.out.println(1l*(X2-X1)*(X2-X1)+1l*(Y2-Y1)*(Y2-Y1) < 1l*(R2+R1)*(R2+R1)?"YES":"NO");
    }
}

