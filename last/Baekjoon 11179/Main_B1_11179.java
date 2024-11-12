import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Integer.parseInt(new StringBuilder().append(Integer.toBinaryString(new Scanner(System.in).nextInt())).reverse().toString(),2));
    }
}
