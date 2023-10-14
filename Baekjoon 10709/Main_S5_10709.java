import java.util.*;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int H = sc.nextInt(), W=sc.nextInt();
      for(int i=0;i<H;i++) {
         String str = sc.next();

         int cloud = -1;
         for(char ch:str.toCharArray()) {
            if(ch=='c')
               cloud=0;
            else if(cloud>=0)
               cloud++;
            System.out.print(cloud+" ");
         }
         System.out.println();
      }      
   }
}
