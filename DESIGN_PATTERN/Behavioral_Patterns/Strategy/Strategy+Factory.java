//https://refactoring.guru/design-patterns/strategy
package DESIGN_PATTERN.Behavioral_Patterns.Strategy;
import java.util.*;
interface Strategy{
    public void execute(int a, int b);
}

class ConcreteStrategyAdd implements Strategy{
    @Override
    public void execute(int a, int b) {
        // Complex addition
        System.out.println("Addition");
    }
}
class ConcreteStrategySub implements Strategy{
    @Override
    public void execute(int a, int b) {
        // Complex substraction
        System.out.println("Sub");
    }
}
class ConcreteStrategyMul implements Strategy{
    @Override
    public void execute(int a, int b) {
        // Complex multipication
        System.out.println("Mul");
    }
}
class ConcreteStrategyDivide implements Strategy{
    @Override
    public void execute(int a, int b) {
        // Complex divide
        System.out.println("Div");
    }
}

class StrategyDecisionFactory{
    public Strategy getStrategy(String type){
        if(type.equals("add")){
            return new ConcreteStrategyAdd();
        }
        if(type.equals("sub")){
            return new ConcreteStrategySub();
        }
        if(type.equals("mul")){
            return new ConcreteStrategyMul();
        }
        else
            return new ConcreteStrategyDivide();
        }
}

class Context {
    Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy(int a ,int b){
        strategy.execute(a, b);
    }
}


// based on user input give them strategy to calculate.
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String value = sc.nextLine();
        Context context = new Context();
        context.setStrategy(new StrategyDecisionFactory().getStrategy(value));
        context.executeStrategy(12,13);
    }
}

