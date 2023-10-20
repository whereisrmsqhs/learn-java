package jungsuk.chapter13;

// 다음 코드의 실행결과로 맞는 것은? b start가 아니라 run을 호출한 것임으로 그냥 메소드 호출임 ㅎ
// 13-3: WAITING으로 만드는 것이 아닌 것은? b, f
// 13-4: interrupt에 의해서 RUNNABLE이 되지 않는 경우는? d suspend는 오직 resume을 통해서만 RUNNABLE으로 다시 갈 수가 있다.

public class Exercise13_2 {
    public static void main(String[] args) {
        Thread2 t1 = new Thread2();
        t1.run();

        for(int i = 0; i < 10; i++){
            System.out.print(i);
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.print(i);
        }
    }
}
