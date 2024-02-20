import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height=sc.nextInt(), width=sc.nextInt(), ans=0;
        if(height==1)           // 움직일 수 없는 경우, 처음에 있는 자리
            ans=1;
        else if(height==2)      // 높이가 2일 경우, 가로2세로1, 가로2세로-1을 번갈아가면서 이동, 3번 이동하면 다른것도 사용해야 하니까 4칸만 가질 수 있음
            ans=Math.min(4, (width+1)/2);
        else if(height>=3){     // 높이가 3일 경우 2가지 경우로 나눠짐
            if(width>=7)        // 가로 길이가 7보다 크면 4가지 이동을 한 상태이기에, 가로2세로1, 가로2세로-1을 이동한 -2를 빼주면 최대칸을 구함
                ans=width-2;
            else                // 가로 길이가 7미만이면 가로1세로2, 가로1세로-2를 이용해서 한칸씩만 움직임, height==1과 마찬가지로 3번밖에 이동못함
                ans=Math.min(4, width);
        }
        System.out.println(ans);
    }
}