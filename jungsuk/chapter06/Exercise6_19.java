package jungsuk.chapter06;

public class Exercise6_19 {
    // 출력 결과는 "ABC123456"
    public static void change(String str){
        str += "456";
    }

    public static void main(String[] args) {
        String str = "ABC123";
        System.out.println(str);
        change(str);
        System.out.println("After change:" + str);
    }
}
