import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int N;
        while((N=sc.nextInt())>0){
            StringBuilder sb = new StringBuilder();
            double tallest=-1;
            for(int i=0;i<N;i++){
                String name = sc.next();
                double height = sc.nextDouble();
                if(height>tallest){
                    tallest=height;
                    sb.setLength(0);
                    sb.append(name+" ");
                } else if(height==tallest)
                    sb.append(name+" ");
            }
            System.out.println(sb);
        }
    }
}