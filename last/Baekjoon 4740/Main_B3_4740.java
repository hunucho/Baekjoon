import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            String str = sc.nextLine();
            if(str.compareTo("***")==0)
                break;
            StringBuilder sb = new StringBuilder();
            System.out.println(sb.append(str).reverse());
        }
    }
}