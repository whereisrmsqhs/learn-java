package jungsuk.chapter06;

public class StudentCard {
    private int num;
    private boolean isKwang;

    public StudentCard(){
        num = 1;
        isKwang = true;
    }

    public StudentCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String info(){
        return num + (isKwang ? "K" : "");
    }
}
