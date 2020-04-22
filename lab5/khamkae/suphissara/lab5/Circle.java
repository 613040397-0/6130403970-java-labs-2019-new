package khamkae.suphissara.lab5;
/**
ID: 613040397-0
* Sec: 1
* Date:  January 13, 2020
*
**/
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Shape {
    protected double radius;

    Circle() {
        this.radius = 1;
    }
    Circle(double radius) {
        this.radius = radius;
    }
    Circle(double radius, String color, boolean filled) {
        super(color, filled); 
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override 
    public double getArea() { 
        double area = (Math.PI) * (radius * radius);
        BigDecimal _area = new BigDecimal(area).setScale(2, RoundingMode.HALF_UP);;
        return _area.doubleValue();
    }
    @Override  
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius; 
        BigDecimal _perimeter = new BigDecimal(perimeter).setScale(2, RoundingMode.HALF_UP);;
        return _perimeter.doubleValue();
    }
    @Override
    public String toString() {
        return "Color:" + color + ", Filled:" + filled + ", radius:" + radius;
    }
}