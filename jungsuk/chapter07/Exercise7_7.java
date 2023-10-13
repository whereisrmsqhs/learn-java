package jungsuk.chapter07;

// 호출하는 생성자의 순서는 Parent() -> Child()생성됨. 실행 결과는 1000
// 7-8: 접근제어자의 범위. a
// 7-9: final에 대해서 옳지 않은 것은. c, 오버로딩이 아니라 오버라이딩 할수 없음.
class Parent{
    int x=100;

    Parent(){
        this(200);
    }

    Parent(int x){
        this.x = x;
    }

    int getX(){
        return x;
    }
}

class Child extends Parent {
    int x = 3000;

    Child() {
        this(1000);
    }

    Child(int x){
        this.x = x;
    }
}

public class Exercise7_7 {
    public static void main(String[] args) {
        Child c = new Child();

        System.out.println("x="+c.getX());
    }

}
