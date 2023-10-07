import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), T=sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        int [] likes = new int [101];
        for(int i=0;i<T;i++){
            int student = sc.nextInt();
            if(likes[student]!=0)
                likes[student]++;
            else {
                if(q.size()<N) {
                    q.add(student);
                }
                else {
                    int min=9999;
                    Iterator value = q.iterator();
                    while(value.hasNext())
                        min = Math.min(min, likes[(int) value.next()]);
                    for(int j=0;j<N;j++){
                        int idx = q.poll();
                        if(likes[idx]==min){
                            likes[idx]=0;
                            min=0;
                        } else
                            q.add(idx);
                    }
                    q.add(student);
                }
                likes[student]++;
            }
        }
        for(int i=1;i<=100;i++)
            if(likes[i]!=0)
                System.out.print(i+" ");
    }
}
