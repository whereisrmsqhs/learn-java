package jungsuk.chapter06;

public class Exercise6_24 {

    public static int abs(int val){
        if(val < 0){
            return val * -1;
        }
        return val;
    }
    public static void main(String[] args) {
        int value = 5;
        System.out.println(value+"의 절대값:"+abs(value));
        value = -10;
        System.out.println(value+"의 절대값:"+abs(value));
    }
}
