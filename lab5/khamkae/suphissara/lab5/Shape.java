package khamkae.suphissara.lab5;
/**
ID: 613040397-0
* Sec: 1
* Date:  January 13, 2020
*
**/
public abstract class Shape {
    protected String color;
    protected boolean filled;

    Shape() {
        this.color = "White";
        this.filled = false;
    }
    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return this.filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea(); 
 
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Color:"+ color + ", Filled:" + filled;
    }
}