package DESIGN_PATTERN.Creational_Patterns.Abstract_Factory;

import java.util.ArrayList;
import java.util.List;

public class HeadFirstExample {

}

// abstract factory.
// abstract factory that has family of products. this is same as pizza store. just difference is we have one product.
interface PizzaIngredientsFactory{
    public Dough createDough();// it is factory method.
    public Sauce createSauce();


    /// more products. family of products.
}

class NyStylePizzaIngredientFactory implements PizzaIngredientsFactory{
    @Override
    public Dough createDough() {
        return new NyDough();
    }

    @Override
    public Sauce createSauce() {
        return new NySauce();
    }

    /// more products. family of products.
}


class ChicagoStylePizzaIngredientFactory implements PizzaIngredientsFactory{
    @Override
    public Dough createDough() {
        return new ChicagoDough();
    }

    @Override
    public Sauce createSauce() {
        return new ChicagoSauce();
    }

    /// more products. family of products.
}

// abstract product and products.
// this class implementation is same as pizza, because this is PRODUCT>
abstract class Dough{
  abstract  void makeDough();
}

class NyDough extends Dough{
      void makeDough(){

      }
}

class ChicagoDough extends  Dough{
    void makeDough(){

    }
}


abstract class Sauce{
    abstract  void makeSauce();
}

class NySauce extends Sauce{
    void makeSauce(){

    }
}

class ChicagoSauce extends  Sauce{
    void makeSauce(){

    }
}







// Client that using the familu of products.
// products.
abstract class Pizza{
    String name;
    Dough dough;
    Sauce sauce;
    List<String> toppings = new ArrayList<>();
    abstract void prepare();
    void bake(){

    }
    void cut(){

    }
    void box(){

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class NyStyleCheesePizza extends Pizza {
    PizzaIngredientsFactory pizzaIngredientsFactory;
    public NyStyleCheesePizza(PizzaIngredientsFactory pizzaIngredientsFactory){
        this.pizzaIngredientsFactory = pizzaIngredientsFactory;
    }

    @Override
    void prepare() {
        dough =pizzaIngredientsFactory.createDough();
        sauce = pizzaIngredientsFactory.createSauce();
//        toppings.add("Grated reggiano cheese");
    }
}

class NyStyleTomatoPizza extends Pizza {

    PizzaIngredientsFactory pizzaIngredientsFactory;
    public NyStyleTomatoPizza(PizzaIngredientsFactory pizzaIngredientsFactory){
        this.pizzaIngredientsFactory = pizzaIngredientsFactory;
    }
    @Override
    void prepare() {
        dough =pizzaIngredientsFactory.createDough();
        sauce = pizzaIngredientsFactory.createSauce();
    }
}


// same as NyStore.
class ChicagoStyleCheesePizza extends Pizza {
    // proper absttraction.
    PizzaIngredientsFactory pizzaIngredientsFactory;
    public ChicagoStyleCheesePizza(PizzaIngredientsFactory pizzaIngredientsFactory){
        this.pizzaIngredientsFactory = pizzaIngredientsFactory;
    }
    @Override
    void prepare() {
        dough =pizzaIngredientsFactory.createDough();
        sauce = pizzaIngredientsFactory.createSauce();
    }
}

class ChicagoStyleTomatoPizza extends Pizza {
    PizzaIngredientsFactory pizzaIngredientsFactory;
    public ChicagoStyleTomatoPizza(PizzaIngredientsFactory pizzaIngredientsFactory){
        this.pizzaIngredientsFactory = pizzaIngredientsFactory;
    }
    @Override
    void prepare() {
        dough =pizzaIngredientsFactory.createDough();
        sauce = pizzaIngredientsFactory.createSauce();
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

class NyStylePizzaStore extends PizzaStore {

    // implementation of factory method.
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza= null;
        PizzaIngredientsFactory pizzaIngredientsFactory = new NyStylePizzaIngredientFactory();
        if(type.equals("cheese")){
            pizza = new NyStyleCheesePizza(pizzaIngredientsFactory);
            pizza.setName("New York style cheese pizza");
        }
        else{
            pizza = new NyStyleTomatoPizza(pizzaIngredientsFactory);
            pizza.setName("New York style tomato pizza");
        }
        return pizza;
    }
}

class ChicagoStylePizzaStore extends PizzaStore {

    // implementation of factory method.
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza;
        PizzaIngredientsFactory pizzaIngredientsFactory = new ChicagoStylePizzaIngredientFactory();
        if(type.equals("cheese")){
            pizza = new ChicagoStyleCheesePizza(pizzaIngredientsFactory);
            pizza.setName("Chicago style cheese pizza");
        }
        else{
            pizza = new ChicagoStyleTomatoPizza(pizzaIngredientsFactory);
            pizza.setName("Chicago style tomato pizza");
        }
        return pizza;
    }
}

