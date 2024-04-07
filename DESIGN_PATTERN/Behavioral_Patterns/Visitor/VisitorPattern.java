package design_pattern.Behavioral_Patterns.Visitor;
import java.util.ArrayList;
import java.util.List;

/*
 * XmlExport Logic will get segregated from Shape class.
 */


public class VisitorPattern {
    public static void main(String args[]){
        List<Shape> list = new ArrayList<>();
        list.add(new Circle());
        list.add(new Dot());
        for(Shape shape : list){
            shape.accept(new XmlExportVisitor());
        }

    }
}


interface Shape{
    void move(int x, int y);
    void draw();
    void accept(Visitor visitor);
}

interface Visitor{
    void visitDot(Dot dot);
    void visitCircle(Circle c);
}

class Dot implements Shape{

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void draw() {

    }

    @Override
    public void accept(Visitor visitor) { /* Change the visitors dynamically */
        visitor.visitDot(this);
        /*
            multiple ways :
                 - strategy
                 - factory + registry pattern.

                 then why we use visitor?
                 - visitor use in already tested class, with less changes
                 - in visitor we pass arguments from outside.
                 - in strategy that different strategies are handled by object himself.

         */
    }
}

class Circle implements Shape{

    @Override
    public void move(int x, int y) {

    }

    @Override
    public void draw() {

    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCircle(this);
    }
}

class XmlExportVisitor implements Visitor{

    @Override
    public void visitDot(Dot dot) {

    }

    @Override
    public void visitCircle(Circle c) {
    }
}

class DBVisitor implements Visitor{

    @Override
    public void visitDot(Dot dot) {

    }

    @Override
    public void visitCircle(Circle c) {

    }
}

