import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vowel="aeiou";
        while(sc.hasNext()){
            String S=sc.nextLine(), s=S;
            boolean ans=true;
            if(S.compareTo("end")==0)
                break;
            if(!S.matches("(.*)["+vowel+"](.*)"))
                ans=false;
            s=s.replaceAll("oo","o").replaceAll("ee","e");
            if(s.matches("(.*)[bcdfghjklmnpqrstvwxyz]{3,}(.*)") || s.matches("(.*)[aeiou]{3}(.*)"))
                ans=false;
            for(int i=1;i<s.length()&&ans;i++)
                if(s.charAt(i-1)==s.charAt(i))
                    ans=false;
            System.out.println("<"+S+"> is "+(ans?"":"not ")+"acceptable.");

        }
    }
}
