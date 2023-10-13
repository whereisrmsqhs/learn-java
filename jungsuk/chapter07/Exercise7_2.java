package jungsuk.chapter07;

// 7-3: 오버라이딩의 정의와 필요성, 오버라이딩은 같은 이름의 메소드를 자손이 새로 갱신하는 개념, 필요한 이유는 이름이 같은 기능 업데이트...
// 7-4: 조건으로 옳지 않는 것은, c, d

public class Exercise7_2 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(int i = 0; i < deck.cards.length; i++){
            System.out.print(deck.cards[i]+",");
        }
        System.out.println();
        System.out.println(deck.pick(0));
    }
}
