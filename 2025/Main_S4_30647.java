import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static class Participant implements Comparable<Participant>{
        String name;
        int score;
        boolean isHidden;
        public Participant(String S, int I, boolean B){
            name = S;
            score = I;
            isHidden = B;
        }

        @Override
        public int compareTo(Participant o) {
            if(this.score == o.score)
                return this.name.compareTo(o.name);
            return o.score - this.score;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        PriorityQueue<Participant> pq = new PriorityQueue<>();
        for(int i=0;i<N;i++){
            String S=br.readLine();
            Pattern pattern = Pattern.compile("\"name\":\"([a-z]*)\",\"score\":([0-9]+),\"isHidden\":([0-1])");
            Matcher matcher = pattern.matcher(S);
            while(matcher.find()){
                pq.add(new Participant(matcher.group(1), Integer.parseInt(matcher.group(2)), matcher.group(3).compareTo("1")==0?true:false));
            }
        }
        int order=1, lastScore=pq.peek().score, tmp=0;
        while(pq.size()>0){
            Participant participant = pq.poll();
            if(participant.score==lastScore){
                tmp++;
            } else {
                order+=tmp;
                tmp=1;
                lastScore = participant.score;
            }
            if(!participant.isHidden)
                System.out.printf("%d %s %d\n", order, participant.name, participant.score);
        }
    }
}