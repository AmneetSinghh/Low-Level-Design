package DESIGN_PATTERN.Creational_Patterns.Factory;
// factory with no arguments.

/*
Factory Method is a creational design pattern
that provides an interface for creating objects in a
superclass, but allows subclasses to alter the type of
objects that will be created.
 */

public class FactoryMethodPatternExample1 {
    public static void main(String args[]){
        Dialog dialog;
        String type = "Web";
        if(type.equals("Web")){
            dialog = new WindowDialog();
        }
        else{
            dialog = new WebDialog();
        }

        dialog.render();
    }
}


// base Creater class.
abstract class Dialog{
    abstract Button1 createButton();// this is the factory method.
    // render just don't know which type of button he just does onClick.
    void render(){
        Button1 b = createButton();
        b.click();
        b.render();
    }
}


// this concrete class returns one product.
class WindowDialog extends Dialog{

    @Override
    Button1 createButton() {
        return new WindowButton();// here we can use the different factory method.
    }
}

// this concrete class returns one product.

class WebDialog extends Dialog{

    @Override
    Button1 createButton() {
        return new WebButton();// what if web supports many type of buttons?
    }
}



// products that has the same interface.

interface Button1{
    void render();
    void click();
}

class WindowButton implements Button1{

    @Override
    public void render() {

    }

    @Override
    public void click() {

    }
}

class WebButton implements Button1{

    @Override
    public void render() {

    }

    @Override
    public void click() {

    }
}