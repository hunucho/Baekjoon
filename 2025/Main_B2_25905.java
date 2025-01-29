import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float ans = 1, min = 1;
        for(int i=0;i<10;i++) {
            float tmp = sc.nextFloat();
            min = Math.min(min, tmp);
            ans *= tmp * 10 / (i + 1);
        }
        System.out.println(ans/min);
    }
}