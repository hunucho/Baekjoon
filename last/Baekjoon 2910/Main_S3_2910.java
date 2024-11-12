import java.io.*;
import java.util.*;

class Main {
    static class Freq implements Comparable<Freq>{
        int id,num, cnt;

        public Freq (int id, int num, int cnt){
            this.id=id;
            this.num=num;
            this.cnt=cnt;
        }

        @Override
        public int compareTo(Freq o) {
            if (this.cnt == o.cnt)
                return this.id - o.id;
            return o.cnt - this.cnt;
        }
    }

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt(), C=sc.nextInt(), id=0;
        HashMap<Integer, Integer> hm = new HashMap();
        ArrayList<Freq> al = new ArrayList<>();
        for(int i=0;i<N;i++) {
            int tmp=sc.nextInt();
            if(hm.containsKey(tmp)){
                al.get(hm.get(tmp)).cnt++;
            } else {
                al.add(new Freq(id, tmp, 1));
                hm.put(tmp,id++);
            }
        }
        Collections.sort(al);
        for(int i=0;i<al.size();i++)
            for(int j=0;j<al.get(i).cnt;j++)
                System.out.print(al.get(i).num+" ");
    }
}