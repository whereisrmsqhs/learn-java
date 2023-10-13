package jungsuk.chapter07;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.EventHandler;

// 7-29: 왜냐하면 지역 메소드가 리턴되고 나서도 해당 값이 유지되어야 하는 상태이기 때문에 final값을 가짐.
public class Exercise7_28 {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.addWindowFocusListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                e.getWindow().setVisible(false);
                e.getWindow().dispose();
                System.exit(0);
            }
        });
    }
}
