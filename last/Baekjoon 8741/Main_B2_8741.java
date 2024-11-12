import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        System.out.println("1".repeat(k)+"0".repeat(k-1));
    }
}
