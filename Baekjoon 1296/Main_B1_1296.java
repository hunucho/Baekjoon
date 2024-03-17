import java.io.*;
import java.util.*;

class Main {
    static int [] nameCnt;
    static String LOVE = "LOVE";
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine(), ansStr="";
        nameCnt = new int [4];
        int N=Integer.parseInt(br.readLine()), ansProb=-1;
        for(int i=0;i<4;i++)
            nameCnt[i] = name.length() - name.replaceAll(LOVE.substring(i,i+1),"").length();

        for(int i=0;i<N;i++) {
            String inStr = br.readLine();
            int tmp = getProbability(inStr);
            if(tmp>ansProb){
                ansProb=tmp;
                ansStr=inStr;
            } else if(tmp==ansProb){
                ansStr = ansStr.compareTo(inStr)<0?ansStr:inStr;
            }
        }
        System.out.println(ansStr);
    }

    public static int getProbability(String str) {
        int probability = 1;
        int [] tempCnt = new int[4];
        for(int i=0;i<4;i++)
            tempCnt[i] = str.length() - str.replaceAll(LOVE.substring(i, i + 1), "").length();

        for(int i=0;i<4;i++){
            for(int j=i+1;j<4;j++)
                probability=(probability * ((nameCnt[i]+tempCnt[i])+(nameCnt[j]+tempCnt[j]))) %100;
        }
        return probability;
    }
}