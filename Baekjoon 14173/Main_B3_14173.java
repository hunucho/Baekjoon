import java.util.*;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1=sc.nextInt(), y1=sc.nextInt(), x2=sc.nextInt(), y2=sc.nextInt();
        int x3=sc.nextInt(), y3=sc.nextInt(), x4=sc.nextInt(), y4=sc.nextInt();
        int X=Math.max(x2, x4) - Math.min(x1, x3), Y=Math.max(y2, y4) - Math.min(y1, y3);
        System.out.println(Math.max(X, Y)*Math.max(X, Y));
        
    }
}
