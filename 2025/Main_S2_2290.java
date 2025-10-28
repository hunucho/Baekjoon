import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S=Integer.parseInt(st.nextToken());
        String N=st.nextToken();
        int [] top = {1, 0, 1, 1, 0, 1, 1, 1, 1, 1};
        int [] topmid = {3, 2, 2, 2, 3, 1, 1, 2, 3, 3}; // left : 1, right : 2, both : 3
        int [] mid = {0, 0, 1, 1, 1, 1, 1, 0, 1, 1};
        int [] botmid = {3, 2, 1, 2, 2, 2, 3, 2, 3, 2};
        int [] bot = {1, 0, 1, 1, 0, 1, 1, 0, 1, 1};
        StringBuilder sb = new StringBuilder();
        int width = S+2, height = 2*S+3;
        for(int i=0;i<height;i++){
            for(char ch:N.toCharArray()) {
                int num = ch-'0';
                String tmp="";
                if (i == 0) {
                    tmp = " "+(top[num]==1?"-":" ").repeat(S)+" ";
                } else if(i<height/2){
                    if(topmid[num]==1)
                        tmp = "|"+" ".repeat(S+1);
                    else if(topmid[num]==2)
                        tmp = " ".repeat(S+1)+"|";
                    else if(topmid[num]==3)
                        tmp = "|"+" ".repeat(S)+"|";
                } else if(i==height/2){
                    tmp = " "+(mid[num]==1?"-":" ").repeat(S)+" ";
                } else if(i==height-1){
                    tmp = " "+(bot[num]==1?"-":" ").repeat(S)+" ";
                } else {
                    if(botmid[num]==1)
                        tmp = "|"+" ".repeat(S+1);
                    else if(botmid[num]==2)
                        tmp = " ".repeat(S+1)+"|";
                    else if(botmid[num]==3)
                        tmp = "|"+" ".repeat(S)+"|";
                }
                sb.append(String.format("%s ", tmp));
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}

/*


      --   --        --   --   --   --   --   --
   |    |    | |  | |    |       | |  | |  | |  |
   |    |    | |  | |    |       | |  | |  | |  |
      --   --   --   --   --        --   --
   | |       |    |    | |  |    | |  |    | |  |
   | |       |    |    | |  |    | |  |    | |  |
      --   --        --   --        --   --   --


 */