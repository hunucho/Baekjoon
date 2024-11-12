import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=1;i<=N;i++)
            al.add(i);
        while(al.size()>1)
            for(int i=0;i<al.size();i++)
                al.remove(i);
        System.out.println(al.get(0));
    }
}
