import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int ax=sc.nextInt(), ay=sc.nextInt(), az=sc.nextInt();
        int ansx=0, ansy=0, ansz=0;
        int cx=sc.nextInt(), cy=sc.nextInt(), cz=sc.nextInt();
        for(int bx=1;bx<=100;bx++){
            for(int by=1;by<=100;by++){
                for(int bz=1;bz<=100;bz++){
                    if(az + bx == cx &&  ay *by==cy && ax + bz==cz) {
                        ansx=bx;
                        ansy=by;
                        ansz=bz;
                        break;
                    }
                }
            }
        }
        System.out.printf("%d %d %d",ansx, ansy, ansz);
    }
}