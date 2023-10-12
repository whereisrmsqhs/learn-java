package jungsuk.chapter06;

import static java.lang.Math.abs;

class MyPoint {
    int x;
    int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getInstance (int x1, int y1){
        return Math.sqrt(abs(x-x1) * abs(x-x1) + abs(y-y1) * abs(y-y1));
    }
}
public class Exercise6_7 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1,1);

        System.out.println(p.getInstance(2,2));
    }
}
