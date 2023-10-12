package jungsuk.chapter06;

public class chapter6Main {
    public static void main(String[] args) {
        StudentCard card1 = new StudentCard(3, false);
        StudentCard card2 = new StudentCard();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}
