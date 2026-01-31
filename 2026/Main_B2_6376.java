import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        StringBuilder sb = new StringBuilder();
        sb.append("n e\n");
        sb.append("- -----------\n");
        sb.append("0 1\n");
        sb.append("1 2\n");
        sb.append("2 2.5\n");
        double e = 2.5;
        int denominator = 2;
        for(int n=3;n<10;n++){
            denominator*=n;
            e=e+(1.0/denominator);
            sb.append(String.format("%d %.9f\n", n, e));
        }
        System.out.println(sb);
    }
}
