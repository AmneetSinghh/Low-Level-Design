package DESIGN_PATTERN.Creational_Patterns.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Shape> shapeList = getShapeArray();

        /*
        * Don't know concrete class, but we are cloning.
        * clone complex objects by just .getClone() no need to do setting and getting
        * complex objects creation is already tested, so do make copying means code maintainability and modularity.
        *
        * */
        for(Shape shape: shapeList){
           Shape cloned =  shape.getClone();
            System.out.println(cloned);
        }

    }

    private static List<Shape> getShapeArray(){
        List<Shape> shapeList = new ArrayList<>();
        Circle circle = new Circle();
        circle.x = 12;
        circle.y = 12;
        circle.color = "first";
        circle.radius = 13;
        shapeList.add(circle);

        Rectangle rec = new Rectangle();
        rec.x = 12;
        rec.y = 12;
        rec.color = "first";
        rec.height = 12;
        rec.width = 12;
        shapeList.add(rec);
        return shapeList;
    }

}


interface ShapeClone {
    Shape getClone();
}

abstract class Shape implements ShapeClone{
    protected int x;
    protected int y;
    protected String color;
    public Shape(){

    }

    public Shape(Shape source){
        this.x = source.x;
        this.y = source.y;
        this.color = source.color;
    }

    public abstract Shape getClone();
}

class Rectangle extends Shape{
    protected int width;
    protected int height;

    public Rectangle(){

    }

    public Rectangle(Rectangle source) {
        super(source);
        this.width = source.width;
        this.height = source.height;
    }

    @Override
    public Shape getClone() {
        return new Rectangle(this);
    }
}

class Circle extends Shape{
    protected int radius;
    public Circle(){

    }

    public Circle(Circle source) {
        super(source);
        this.radius = source.radius;
    }

    @Override
    public Shape getClone() {
        return new Circle(this);
    }
}