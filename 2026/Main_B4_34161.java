import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<10000;i++)
            sb.append(-1).append("\n");
        System.out.print(sb.toString());
    }
}