package jungsuk.chapter06;

// 라인 A: 클래스 변수는 인스턴스 변수로 초기화가 안됨. 클래스 변수가 메모리에 올라가면서 생성이 되는 시점에는 인스턴스 변수 자체가 존재하지 않음.
// 라인 B: 클래스 메소드안에서는 인스턴스 변수를 사용할 수가 없음 이유는 A와 같음.
// 라인 D: B와 같은 이유로 에러.

//class MemberCall {
//    int iv = 10;
//    static int cv = 20;
//
//    int iv2 = cv;
//    static int cv2 = iv;
//
//    static void staticMethod1(){
//        System.out.println(cv);
//        System.out.println(iv);
//    }
//
//    void instanceMethod1(){
//        System.out.println(cv);
//        System.out.println(iv);
//    }
//
//    static void staticMethod2(){
//        staticMethod1();
//        instanceMethod1();
//    }
//
//    void instanceMethod2(){
//        staticMethod1();
//        instanceMethod1();
//    }
//}
public class Exercise6_18 {
}
