package jungsuk.chapter07;

// 7-12: 다음중 틀린 것은? c
// 7-13: Math클래스의 생성자는 private이다. 그 이유는 인스턴스를 생성하지 않고 클래스 메소드만을 사용하게 할려고. 인스턴스 변수 자체가 존재하지 않음.
// 7-15: 형변환을 올바르게 하지 않은 것은?  e
// 7-16: 연산 결과가 true가 아닌 것은? e
//

public class Exercise7_11 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setChannel(20);
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
    }
}
