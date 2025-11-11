import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A=Integer.parseInt(st.nextToken()), B=Integer.parseInt(st.nextToken()), C=Integer.parseInt(st.nextToken());
        // HashMap을 이용하여 이름과 가격을 입력
        HashMap<String, Integer> normal = new HashMap<>(), special = new HashMap<>();
        // 일반메뉴를 A개 입력
        for(int i=0;i<A;i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int price = Integer.parseInt(st.nextToken());
            normal.put(name, price);
        }
        // 특별메뉴를 B개를 입력
        for(int i=0;i<B;i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int price = Integer.parseInt(st.nextToken());
            special.put(name, price);
        }
        // 일반메뉴, 특별메뉴가 아니면 서비스메뉴이기에 그냥 줄만 넘김
        for(int i=0;i<C;i++){
            String name = br.readLine();
        }
        int N=Integer.parseInt(br.readLine());
        // 금액은 1,000,000 * 150,000까지 나올수 있기에 long을 사용
        // 메뉴별로 금액을 다르게 저장
        long priceNormal=0, priceSpecial=0;
        // 서비스메뉴의 갯수를 카운팅
        int countService=0;
        for(int i=0;i<N;i++){
            String name = br.readLine();
            // 일반메뉴안에 있다면 일반메뉴
            if(normal.containsKey(name))
                priceNormal+=normal.get(name);
            // 특별메뉴안에 있다면 특별메뉴
            else if(special.containsKey(name))
                priceSpecial+=special.get(name);
            // 아니라면 서비스메뉴이기에 갯수를 증가
            else
                countService++;
        }
        boolean ans = true;
        // 서비스메뉴는 1개까지만 주문가능
        if(countService>=2)
            ans = false;
        // 서비스메뉴가 1개라면 가격이 5만이상이어야 함. 0개라면 정상이기에 패스
        else if(countService==1 && priceNormal+priceSpecial<50000)
            ans = false;
        // 특별메뉴 가격이 0보다 크면 일반메뉴 금액이 2만이상이어야 함
        else if(priceSpecial>0 && priceNormal<20000)
            ans = false;
        System.out.print(ans?"Okay":"No");
    }
}