import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println(f());
    }

    public static int f(){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), L=sc.nextInt(), D=sc.nextInt(), time=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<L;j++){
                time++;
            }
            for(int j=0;j<5;j++) {
                if (time % D == 0)
                    return time;
                time++;
            }
        }
        while(time%D!=0){
            time++;
        }
        return time;
    }
}
