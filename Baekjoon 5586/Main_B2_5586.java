import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int joi=0, ioi=0;
        for(int i=2;i<str.length();i++){
            if(str.charAt(i-2)=='J'&&str.charAt(i-1)=='O'&&str.charAt(i)=='I')
                joi++;
            if(str.charAt(i-2)=='I'&&str.charAt(i-1)=='O'&&str.charAt(i)=='I')
                ioi++;
        }
        System.out.println(joi+"\n"+ioi);
    }
}
