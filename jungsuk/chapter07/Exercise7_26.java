package jungsuk.chapter07;

class Outer2{
    static class Inner{
        int iv=200;
    }
}
public class Exercise7_26 {
    public static void main(String[] args) {
        Outer2.Inner inner = new Outer2.Inner();
        int iv = inner.iv;
        System.out.println(iv);
    }
}
