package jungsuk.chapter07;

// 7-20: 다음 코드 실행한 결과는? p.x=100\n Child Method\n c.x=200\n Child Method
// 7-21: Movable을 구현한 객체의 인스턴. 하나는 모르겠는데요... 또 하나는 null....
public class Exercise7_19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
}

class Buyer {
    int money = 1000;
    Product[] cart = new Product[3];
    int i = 0;

    void buy(Product p){
        if(money < p.price) {
            System.out.println("잔액이 부족하여 " + p +"을/를 살수 없습니다.");
            return;
        }
        money -= p.price;
        add(p);
    }

    void add(Product p){
        if(cart[cart.length-1] != null){
            Product[] temp = new Product[cart.length*2];
            for(int i = 0; i < cart.length; i++){
                temp[i] = cart[i];
            }
            cart = temp;
        }
        for(int i = 0; i < cart.length; i++){
            if(cart[i]==null){
                cart[i] = p;
                break;
            }
        }
    }

    void summary(){
        int total = 0;
        System.out.print("구입한 물건: ");
        for(int i = 0; i < cart.length; i++){
            if(cart[i]==null) break;
            System.out.print(cart[i]+", ");
            total += cart[i].price;
        }
        System.out.println();
        System.out.println("사용한 금액: " + total);
        System.out.println("남은 금액: " + money);
    }
}

class Product {
    int price;

    Product(int price){
        this.price = price;
    }
}

class Tv extends Product{

    Tv() {
        super(100);
    }

    public String toString(){
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString(){
        return "Computer";
    }
}

class Audio extends Product{
    Audio(){
        super(50);
    }
    public String toString(){
        return "Audio";
    }
}