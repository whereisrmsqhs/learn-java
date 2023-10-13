package jungsuk.chapter07;

import jungsuk.chapter06.StudentCard;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck(){
        for(int i = 0; i < 10; i++){
            if(i==0 || i==2 || i==7){
                cards[i] = new SutdaCard(i+1, true);
            }
            else{
                cards[i] = new SutdaCard(i+1, false);
            }
        }
        for(int i = 0; i < 10; i++){
            if(i==0 || i==2 || i==7){
                cards[i+10] = new SutdaCard(i+1, true);
            }
            else{
                cards[i+10] = new SutdaCard(i+1, false);
            }
        }
    }
    public void shuffle(){
        for(int i = 0; i < 20; i++){
            int num = (int)Math.random()*20+1;
            SutdaCard temp = cards[i];
            cards[i] = cards[num];
            cards[num] = temp;
        }
    }

    public SutdaCard pick(int index){
        return cards[index];
    }

    public SutdaCard pick(){
        return cards[(int)Math.random()*20+1];
    }
}

class SutdaCard {
    final int num;
    final boolean isKwang;

    SutdaCard(){
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString(){
        return num + (isKwang ? "K" : "");
    }
}
public class Exercise7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for(int i = 0; i < deck.cards.length; i++){
            System.out.print(deck.cards[i]+",");
        }
    }
}
