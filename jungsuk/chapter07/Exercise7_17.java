package jungsuk.chapter07;

class Unit {
    int x, y;
    void stop(){}
    void move(int x, int y){}
}
class Marine extends Unit{
    void move(int x, int y){}
    void stimPack() {}
}

class Tank extends Unit{
    void changeMode(){}
}

class Dropship extends Unit{
    void load(){}
    void unload(){}
}
public class Exercise7_17 {
}
