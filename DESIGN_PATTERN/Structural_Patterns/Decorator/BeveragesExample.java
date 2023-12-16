package DESIGN_PATTERN.Structural_Patterns.Decorator;

// so as we can see decorator pattern, adding some new responsibilites/functionlaties to the excisting code at runtime by object composition.
public class BeveragesExample {
    public static void main(String args[]){
        Beverages coffee_1 = new Coffee_1();// we create a beverage.
//        System.out.println("First -> "+ coffee_1.getDescription());
//        now decorate it with milk
//        coffee_1 = new Milk(coffee_1);
//        coffee_1.setSize(Beverages.Size.LONG);
//        Beverages.Size s =  coffee_1.getSize();
//        System.out.println(s);

//        System.out.println("Second  -> "+ coffee_1.getDescription());

        coffee_1 = new Mocha(coffee_1);
//        System.out.println("Third -> "+ coffee_1.getDescription());

        coffee_1 = new Milk(coffee_1);
//        System.out.println("Fourth -> "+ coffee_1.getDescription());


        coffee_1 = new Milk(coffee_1);
        System.out.println("Fifth -> "+ coffee_1.getDescription());


    }
}


// abstract component
abstract class Beverages{
    private String description = "Unknown Description";
    public enum Size{
        TAIL, HIGH, LONG
    }

    Size size = Size.TAIL;
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setSize(Size size){
        System.out.println("New size-> "+ size);
        this.size = size;
    }

    public Size getSize(){
        System.out.println("In beverages sizes :");
        return this.size;
    }

    public abstract Integer cost();// this means, this must be implemented in child classes.
}
// concrete components
class Coffee_1 extends Beverages {

    public Coffee_1(){
        setDescription("Coffe_1");
        setSize(Size.HIGH);
    }
    @Override
    public Integer cost() {
        return 10;
    }

}

class Coffee_2 extends Beverages {

    public Coffee_2(){
        setDescription("Coffee_2");
    }
    @Override
    public Integer cost() {
        return 10;
    }
}

// decorator class
abstract class ContimenentDecorator extends Beverages {
    Beverages beverages;
    public abstract String getDescription();// each decorator will add its description.

    public Size getSize(){
        System.out.println("Contimenent Decorator size");
        return this.size;
    }

}

// decorator concrete class.
class Mocha extends ContimenentDecorator {
    public Mocha(Beverages beverages){
        this.beverages = beverages;
    }

    public String getDescription(){
        System.out.println("Mocha-> "+beverages.toString());
        return beverages.getDescription() + " Mocha, ";
    }

    public Size getSize(){
        System.out.println("In Mocha Sizes -> "+ this.size);
        return this.size;
    }

    public Integer cost(){
        return beverages.cost() + 20;
    }
}

class Milk extends ContimenentDecorator {
    public Milk(Beverages beverages){
        this.beverages = beverages;
    }

    public String getDescription(){
        System.out.println("Milk-> "+beverages.toString());
        return beverages.getDescription() + " Milk, ";
    }

    public Size getSize(){
        super.getSize();
        System.out.println("In Mlik Sizes -> "+ this.size);
        return this.size;
    }

    public Integer cost(){
        return beverages.cost() + 30;
    }
}
