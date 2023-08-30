import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        while(T>0){
            String str = br.readLine();
            int len=str.length();
            System.out.println(str.charAt(len/2-1)==str.charAt(len/2)?"Do-it":"Do-it-Not");
            T--;
        }
    }
}
