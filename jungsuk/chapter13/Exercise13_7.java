package jungsuk.chapter13;

// 일단은 sleep이 끝나고 나서 바로 실행으로 가는 것은 아니고 실행 가능 상태로 가는 것. 그렇기 때문에 시간이 걸림.
// 그리고 stopped라는 변수를 부른거고, stopped를 true로 바꾼 상황을 Thread5가 다시 인지하는데 시간이 걸릴듯.
// 개선할려면 그냥 interrput()을 부르면 될듯? 이렇게하면 for문안의 3초가 지날때까지 기다리지 않아도 된다.
public class Exercise13_7 {
    static boolean stopped = false;

    public static void main(String[] args) {
        Thread5 th1 = new Thread5();
        th1.start();

        try{
            Thread.sleep(6 * 1000);
        } catch (Exception e) {}

        th1.interrupt();

        stopped = true;
        System.out.println("stopped");
    }
}

class Thread5 extends Thread {
    public void run(){
        for(int i = 0; !Exercise13_7.stopped; i++){
            System.out.println(i);

            try{
                Thread.sleep(3*1000);
            } catch (Exception e) {}
        }
    }
}
