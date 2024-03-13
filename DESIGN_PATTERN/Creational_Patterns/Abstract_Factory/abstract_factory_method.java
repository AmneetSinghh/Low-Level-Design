package design_pattern.Creational_Patterns.Abstract_Factory;
/*
Abstract Factory is a creational design pattern that lets you produce families of related objects
without specifying their concrete classes.
*/

// each specific factory return one kind of product.


// products.
interface Button{
    void paint();
}
class WinButton implements Button{

    @Override
    public void paint() {

    }
}
class MacButton implements Button{

    @Override
    public void paint() {

    }
}


interface CheckBox{
    void paint();
}
class WinCheckBox implements CheckBox{

    @Override
    public void paint() {

    }
}
class MacCheckBox implements CheckBox{

    @Override
    public void paint() {

    }
}



// abstract factory
// by seeing this we only know this is returning button , proper abstractin
interface GuiFactory{
    Button createButton();
    CheckBox createCheckBox();
}
class WinFactory implements GuiFactory{

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}

class MacFactory implements GuiFactory{

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}



// application that uses the button or checkbox..
class Application{
    GuiFactory factory;
    Button button;
    public Application(GuiFactory factory){
        this.factory = factory;
    }
    public void createUI(){
        this.button = factory.createButton();
    }
    public void paint(){
        this.button.paint();
    }
}


// we can create a factory for this as well.
public class abstract_factory_method {
    public static void main(String args[]){
        GuiFactory factory;
        String type = "Mac";
        if(type.equals("Mac")){
            factory = new MacFactory();
        }
        else{
            factory = new WinFactory();
        }
        Application application = new Application(factory);
    }
}
