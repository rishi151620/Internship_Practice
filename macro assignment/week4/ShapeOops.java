// 6. Shapes: Create a class called Shape that has properties such as color and a method to calculate the area. Create subclasses such as Rectangle, Triangle, and Circle that inherit from Shape and override the area calculation method. Create a class called ShapeTester that creates objects of the different shape classes and calls the area calculation method on them.
abstract class Shape {
    private String color;
    
    public Shape(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }
    
    public abstract double calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    public double calculateArea() {
        return length * width;
    }
}
class Triangle extends Shape {
    private double base;
    private double height;
    
    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
class Circle extends Shape {
    private double radius;
    
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Shapemain {
    public static void main(String[] args) {
        Shape rec = new Rectangle("red", 5, 10);
        Shape tri = new Triangle("blue", 3, 6);
        Shape cir = new Circle("green", 4);
        
        System.out.println("Rectangle area: " + rec.calculateArea());
        System.out.println("Triangle area: " + tri.calculateArea());
        System.out.println("Circle area: " + cir.calculateArea());
    }
}