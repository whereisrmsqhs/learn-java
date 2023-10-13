package jungsuk.chapter07;

// 7-5: 에러가 나는 이유와 고치는 방법은? 에러가 나는 이뉴는 자손 생성자에서 아무것도 안쓰면 super()가 호출이 되는데 이는 부모의 default 생성자를
// 호출하는데 해당 코드의 부모 객체인 Product객체는 default 생성자가 없다. 고칠려면 Product객에 default 생성자를 만들어주거나 아니면
// Tv 객체의 생성자에서 super(int price)를 넣어줘야 한다.

// 7-6: 자손 클래스의 생성자에서 조상 클래스의 생성자를 호출하는 이유는?
// 자손 클래스에서 조상 클래스의 멤버를 사용하는 경우가 있을때 조상 클래스를 만들지 않으면 사용할 수 없기 때문에.
//class Product {
//    int price;
//    int bonusPoint;
//
//    Product(int price){
//        this.price = price;
//        bonusPoint = (int)(price/10.0);
//    }
//}
//
//class Tv extends Product {
//    Tv() {}
//
//    public String toString(){
//        return "Tv";
//    }
//}
//public class Exercise7_5 {
//    public static void main(String[] args) {
//        Tv t = new Tv();
//    }
//}
