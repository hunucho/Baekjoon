package gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

import bronze.temp;

public class Main_G2_17143 {
	static int r,c,m,ans;
	static int[] dx= {0,-1,1,0,0}, dy= {0,0,0,1,-1};	// shark의 dir과 동일하게 하기 위해 0인덱스를 추가
	static TreeMap<Integer, Shark> map = new TreeMap<>();
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		r=Integer.parseInt(st.nextToken());
		c=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int x=Integer.parseInt(st.nextToken()), y=Integer.parseInt(st.nextToken());
			map.put(x*1000+y, new Shark(x,y,Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
		}
		
		for(int i=1;i<=c;i++){
			ans+=fish(i);
			move();
			
		}
		
		System.out.println(ans);
	}
	
	static int fish(int locy) {
		int temp=0;
		for(int shark:map.keySet()) {
			if(shark%1000==locy) {
				temp=map.get(shark).size;
				map.remove(shark);
				return temp;
			}
		}
		return temp;
	}
	
	static void move() {
		TreeMap<Integer, Shark> tempMap = new TreeMap<>();
		
		for(int shark : map.keySet()) {
			Shark cur = map.get(shark);
			int speed=map.get(shark).speed;
			int rotate=0;
			if(map.get(shark).dir>=3)
				rotate = (c-1)*2;
			else if(map.get(shark).dir<=2)
				rotate = (r-1)*2;
			speed%=rotate;
			
			for(int j=0;j<speed;j++){
				if(cur.dir>=3){						
					if(cur.y+dy[cur.dir] <=0 ||cur.y+dy[cur.dir] >c)
						cur.dir=7-cur.dir;
				}
				else if(cur.dir<=2){
					if(cur.x+dx[cur.dir] <=0 ||cur.x+dx[cur.dir] >r)
						cur.dir=3-cur.dir;
				}
				cur.x+=dx[cur.dir];
				cur.y+=dy[cur.dir];
			}
			if(!tempMap.containsKey(cur.x*1000+cur.y))
				tempMap.put(cur.x*1000+cur.y, cur);
			else {
				if(tempMap.get(cur.x*1000+cur.y).size<cur.size)
					tempMap.put(cur.x*1000+cur.y, cur);
			}
		}
		map=tempMap;
		
		
	}
	
	static void eat() {
		for(int shark:map.keySet())
			System.out.println(shark);
		System.out.println();
//		for(int i=1;i<=r;i++) {
//			for(int j=1;j<=c;j++) {
//				if(map[i][j]>0) {
//					for(int k=0;k<m;k++) {
//						if(i==sharks[k].x && j==sharks[k].y && sharks[k].size<map[i][j]) {
//							sharks[k].size=0;
//							sharks[k].speed=-1;
//							sharks[k].x=sharks[k].y=-1;
//							reduce(k);
//							k--;
//						}
//					}
//				}
//			}
//		}
	}
	
	static class Shark{
		int x, y;
		int speed;
		int dir; // 1:Up, 2:Down, 3:Left, 4:Right;
		int size;
		public Shark(int x, int y, int speed, int dir, int size) {
			this.x = x;
			this.y = y;
			this.speed = speed;
			this.dir = dir;
			this.size = size;
		}			
	}
}
