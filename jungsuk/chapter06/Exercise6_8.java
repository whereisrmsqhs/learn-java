package jungsuk.chapter06;


// 클래스 변수는 width, height
// 인스턴스 변수는 kind, num\
// 지역 변수는 없음.
class PlayingCard {
    int kind;
    int num;

    static int width;
    static int height;

    PlayingCard(int k, int n){
        kind = k;
        num = n;
    }
}
public class Exercise6_8 {
    public static void main(String[] args) {
        PlayingCard card = new PlayingCard(1,1);
    }
}
