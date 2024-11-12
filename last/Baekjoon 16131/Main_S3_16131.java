import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

class Main {

    public static void swap(int loc1, int loc2){
        int st1=room.get(loc1), st2 = room.get(loc2);
        room.put(loc1,st2);
        room.put(loc2,st1);
        score[st1]+=2;
        score[st2]-=2;
    }
    static HashMap<Integer, Integer> room;      // 방을 기준으로 학생을 저장
    static int [] score;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken()), A=Integer.parseInt(st.nextToken()), B=Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken());
        int sum=0, duration=0, tmp=0;
        room = new HashMap<>();
        score = new int[N+1];
        for(int i=1;i<=N;i++)
            room.put(i,i);
        if(Math.abs(A-1)<=B)    // 첫 주에 B이하의 거리면 첫 주에 만족함
            sum=duration=tmp=1;
        for(int m=0;m<M-1;m++) {
            st = new StringTokenizer(br.readLine());
            for(int i=1;i<=N;i++)
                score[i] += Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for(int i=1;i<=N;i++)
                score[i] -= Integer.parseInt(st.nextToken());

            for(int i=1;i<N;i++) {
                if(score[room.get(i)]>=0 && score[room.get(i+1)]<0)
                    continue;
                else if(score[room.get(i)]>=0 && score[room.get(i+1)]>=0 && score[room.get(i)]+2<=score[room.get(i+1)])
                    swap(i,i+1);
                else if(score[room.get(i)]<0 && score[room.get(i+1)]>=0)
                    swap(i,i+1);
                else if(score[room.get(i)]<0 && score[room.get(i+1)]<0 && score[room.get(i)]+4<=score[room.get(i+1)])
                    swap(i,i+1);
            }
            Arrays.fill(score,0);       // 상점과 벌점은 매주 초기화된다
            int targetA=0, targetB=0;
            for(int i=1;i<=N;i++) {     // 방 기준으로 학생들의 학번을 찾는다
                if(room.get(i)==1) {
                    targetA=i;
                }
                if(room.get(i)==A) {
                    targetB=i;
                }
            }
            if(Math.abs(targetA-targetB)<=B) {
                sum++;
                tmp++;              // 연속적인 기간을 체크
                duration=Math.max(duration, tmp);
            } else {
                duration=Math.max(duration, tmp);       // 초기화전 최대값인지 확인
                tmp=0;
            }
        }
        System.out.println(sum+" "+duration);
    }
}