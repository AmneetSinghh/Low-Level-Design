package DESIGN_PATTERN.Creational_Patterns.Factory;

import java.util.ArrayList;
import java.util.List;

public class HeadFirstExample {
    public static void main(String args[]){
        PizzaStore pizzaStore = new ChicagoStylePizzaStore();
        pizzaStore.orderPizza("cheese");// pizza creation is on abstraction.
        System.out.println("Cheese pizza ordered from chicagostyle pizza store");
    }
}


// products.
abstract class Pizza{
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    void prepare(){
        System.out.println("preparing "+ name);
        System.out.println("Tossing doughh.... ");
        System.out.println("adding toppings....   ");
        for(String toppping : toppings){
           System.out.println(" "+ toppping);
        }
    }
    void bake(){

    }
    void cut(){

    }
    void box(){

    }

    public String getName() {
        return name;
    }
}

class NyStyleCheesePizza extends Pizza{
    public NyStyleCheesePizza(){
        name = "NyStyleCheesePizza";
        dough = "thin crust daugh";
        sauce = "Margirita";
        toppings.add("Grated reggiano cheese");
    }
}

class NyStyleTomatoPizza extends Pizza{
    public NyStyleTomatoPizza(){
        name = "NyStyleTomatoPizza";
        dough = "thin crust daugh";
        sauce = "Margirita";
        toppings.add("Grated reggiano cheese");
    }
}


class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        name = "ChicagoStyleCheesePizza";
        dough = "thin crust daugh";
        sauce = "Margirita";
        toppings.add("Grated reggiano cheese");
    }
}

class ChicagoStyleTomatoPizza extends Pizza{
    public ChicagoStyleTomatoPizza(){
        name = "ChicagoStyleTomatoPizza";
        dough = "thin crust daugh";
        sauce = "Margirita";
        toppings.add("Grated reggiano cheese");
    }
}


// creator classes.
abstract class PizzaStore{
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);// don't know what type of pizza we are making.       THIS IS ABSTRACTION.
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    protected abstract Pizza createPizza(String type);// factory method.
    // other methods here. implement all the methods here that uses createPizza.
    // so for this abstract pizza class. create pizza is abstraction;
}

class NyStylePizzaStore extends PizzaStore{

    // implementation of factory method.
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        if(type.equals("cheese")){
            pizza = new NyStyleCheesePizza();
        }
        else{
            pizza = new NyStyleTomatoPizza();
        }
        return pizza;
    }
}

class ChicagoStylePizzaStore extends PizzaStore{

    // implementation of factory method.
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        if(type.equals("cheese")){
            pizza = new ChicagoStyleCheesePizza();
        }
        else{
            pizza = new ChicagoStyleTomatoPizza();
        }
        return pizza;
    }
}