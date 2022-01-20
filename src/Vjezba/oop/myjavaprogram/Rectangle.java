package Vjezba.oop.myjavaprogram;

public class Rectangle extends Shape{

    private double witht;
    private double height;

    public Rectangle(int x, int y, String color, String name, double witht, double height) {
        super(x, y, color, name);
        this.witht = witht;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return witht * height;
    }
}
