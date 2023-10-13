package jungsuk.chapter07;

abstract class Shape {

    Point p;
    Shape(){
        this(new Point(0, 0));
    }

    Shape(Point p){
        this.p = p;
    }

    abstract double calcArea();

    Point getPosition(){
        return p;
    }

    void setPosition(Point p){
        this.p = p;
    }
}

class Point {
    int x;
    int y;

    Point(){
        this(0, 0);
    }

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "["+x+","+y+"]";
    }
}

class Circle extends Shape {

    final double PI = 3.14f;
    double r;

    Circle(double r){
        super();
        this.r = r;
    }

    @Override
    double calcArea() {
        return r*r*PI;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height){
        super();
        this.width = width;
        this.height = height;
    }

    boolean isSquare(){
        return width==height ? true : false;
    }
    @Override
    double calcArea() {
        return width*height;
    }
}
public class Exercise7_22 {

}
