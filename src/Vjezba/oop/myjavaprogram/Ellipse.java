package Vjezba.oop.myjavaprogram;


public class Ellipse extends Shape {
    private double a;
    private double b;

    public Ellipse(int x, int y, String color, String name, double a, double b) {
        super(x, y, color, name);
        this.a = a;
        this.b = b;
    }

    public Ellipse(int x, int y, String color, String name) {
        super(x,y,color, name);

    }

    @Override
    public double calculateArea() {
        return a * b * Math.PI;
    }
}
