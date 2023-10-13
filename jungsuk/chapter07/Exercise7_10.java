package jungsuk.chapter07;

import java.util.Vector;

class MyTv2 {
    boolean isPowerOn;
    int channel;
    int volume;
    int prev_channel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public int getChannel(){
        return channel;
    }

    public int getVolume(){
        return volume;
    }

    public void setChannel(int channel){
        prev_channel = this.channel;
        this.channel = channel;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public int gotoPrevChannel(){
        int temp = channel;
        channel = prev_channel;
        prev_channel = temp;
        return channel;
    }

}

public class Exercise7_10 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setVolume(20);
        System.out.println("VOL:"+t.getVolume());
    }

}
