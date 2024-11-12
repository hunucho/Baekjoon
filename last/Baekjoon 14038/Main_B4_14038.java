import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt=0;
        for(int i=0;i<6;i++)
            if(sc.nextLine().equals("W"))
                cnt++;
        switch (cnt){
            case 5: case 6:cnt=1;break;
            case 3: case 4:cnt=2;break;
            case 1: case 2:cnt=3;break;
            default:cnt=-1;
        }
        System.out.println(cnt);
    }
}
