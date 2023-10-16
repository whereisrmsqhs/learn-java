package jungsuk.chapter09;

public class Exercise9_8 {

    public static double round(double d, int n){
        double ten_pow = Math.pow(10, n);
        return Math.round(d * ten_pow) / ten_pow;
    }
    public static void main(String[] args) {
        System.out.println(round(3.1415, 1));
        System.out.println(round(3.1415, 2));
        System.out.println(round(3.1415, 3));
        System.out.println(round(3.1415, 4));
        System.out.println(round(3.1415, 5));
    }
}
