package jungsuk.chapter06;

import static java.lang.Math.abs;

public class Exercise6_6 {

    static double getDistance(int x, int y, int x1, int y1){
        return Math.sqrt(abs(x-x1) * abs(x-x1) + abs(y-y1) * abs(y-y1));
    }
    public static void main(String[] args) {
        System.out.println(getDistance(1, 1, 2, 2));
    }
}
