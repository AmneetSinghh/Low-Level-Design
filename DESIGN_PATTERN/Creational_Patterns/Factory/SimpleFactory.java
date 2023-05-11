package DESIGN_PATTERN.Creational_Patterns.Factory;

// EXAMPLE OF FACTORY METHOD.
public class SimpleFactory {
    public static void main(String args[]){
        ButtonFactory factory = new ButtonFactory();// we will pass factory from the constructor injection so that we not create concrete object here.
        Button myButton = factory.getButton("First");
        myButton.paint();
    }
}


interface Button{
    void paint();
}

class FirstButton implements  Button{

    @Override
    public void paint() {
        System.out.println("First button");
    }
}

class SecondButton implements  Button{

    @Override
    public void paint() {
        System.out.println("Second button");
    }
}

class ThirdButton implements  Button{

    @Override
    public void paint() {
        System.out.println("Third button");
    }
}

// we can pass the arguments.
class ButtonFactory{
    Button getButton(String type){
        if(type.equals("First")){
            return new FirstButton();
        }
        else if(type.equals("Second")){
            return new SecondButton();
        }
        return new ThirdButton();
    }
}