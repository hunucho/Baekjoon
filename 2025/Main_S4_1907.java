import java.util.*;
import java.io.*;

class Main {
    static int [][] elements;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        elements = new int [3][26];
        elements[0] = getElement(S.substring(0, S.indexOf('+')));
        elements[1] = getElement(S.substring(S.indexOf('+')+1, S.indexOf('=')));
        elements[2] = getElement(S.substring(S.indexOf('=')+1));
        getAns();
    }

    static int [] getElement(String S){
        int cnt=0;
        int [] ret = new int [26];
        // 들어온 분자식을 숫자, 원소 형태로 나타내기 위해서 역순으로 처리
        for(int i=S.length()-1;i>=0;i--){
            // 2. 카운팅이 된 상황이라면 해당 원소는 2개 이상
            if(cnt>0) {
                ret[S.charAt(i)-'A']+=cnt;
                cnt=0;
            }
            // 1. 숫자라면 다음에 들어올 원소 갯수가 2개 이상
            else if('2'<=S.charAt(i) && S.charAt(i)<='9')
                cnt=S.charAt(i)-'0';
            // 3. 카운팅이 되지 않았다면 원소는 1개
            else
                ret[S.charAt(i)-'A']++;
        }
        return ret;
    }

    static void getAns(){
        int [][] arr = new int[3][3];
        // 비교할 "CHO"만 카운팅 하기위해 생성한 배열
        for(int i=0, j=0;i<3;i++, j=0){
            for(char ch : "CHO".toCharArray())
                arr[i][j++]=elements[i][ch-'A'];
        }
        // 문제에서 계수는 1~10 사이
        // i, j, k 각각 X1, X2, X3의 값이 됨
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10;j++){
                for(int k=1;k<=10;k++) {
                    boolean chk = true;
                    for(int l=0;l<3;l++){
                        // i, j, k의 값에 대해서 하나라도 계수식을 만족하지 못하면 fail
                        if(arr[0][l]*i+arr[1][l]*j != arr[2][l]*k) {
                            chk = false;
                            break;
                        }
                    }
                    if(chk){
                        System.out.printf("%d %d %d", i, j, k);
                        return;
                    }
                }
            }
        }
    }
}