import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A=sc.next(), B=sc.next();
        int lena=A.length(), lenb=B.length();
        int [][] arr = new int [lena+1][lenb+1];
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=lena;i++){
            for(int j=1;j<=lenb;j++){
                if(A.charAt(i-1)==B.charAt(j-1))
                    arr[i][j]=arr[i-1][j-1]+1;
                else
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
            }
        }
        int i=lena, j=lenb, cnt=arr[i][j];
        while(true){
            if(i<1 || j<1)
                break;
            if(arr[i-1][j]==arr[i][j]){
                i--;
            } else if(arr[i][j-1]==arr[i][j]){
                j--;
            }else if(arr[i-1][j]==arr[i-1][j-1]){
                sb.append(A.charAt(i-1));
                i--;
                j--;
            }
        }
        System.out.println(arr[lena][lenb]+"\n"+sb.reverse());
    }
}
