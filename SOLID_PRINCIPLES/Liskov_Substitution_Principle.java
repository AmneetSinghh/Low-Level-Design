package SOLID_PRINCIPLES;
public class Liskov_Substitution_Principle {

    public static void main(String[] args) {

        System.out.println("******   Liskov  Substitution Principle   ******");
    }
}
// exmaple https://www.baeldung.com/java-liskov-substitution-principle#:~:text=The%20Liskov%20Substitution%20Principle%20helps,follow%20the%20Open%2FClosed%20principle.

/*
1. This principle tell you , how to inherit properly.
2. if a function takes a instance of a class. that same fucntion shoudl also be able to take the instance of the derived class from that class.
3. However, behavioral subtyping means that not only does a subtype provide all of the methods in the supertype,
but it must adhere to the behavioral specification of the supertype.
This ensures that any assumptions made by the clients about the supertype behavior are met by the subtype.
 */







// Do Implement Example.