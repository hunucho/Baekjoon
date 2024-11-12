import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
        	String str = sc.nextLine();
        	if(str.compareTo("EOI")==0)
        		break;
        	str = str.toLowerCase();
        	System.out.println(str.contains("nemo")?"Found":"Missing");
        }
    }
}
