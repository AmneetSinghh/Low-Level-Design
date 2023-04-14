package SOLID_PRINCIPLES;
public class Open_closed_principle {

    public static void main(String[] args) {

        System.out.println("******   Open  Closed Principle   ******");
    }
}
//https://en.wikipedia.org/wiki/Open%E2%80%93closed_principle#:~:text=In%20object%2Doriented%20programming%2C%20the,without%20modifying%20its%20source%20code.        for defination.
//http://joelabrahamsson.com/a-simple-example-of-the-openclosed-principle/
//https://www.youtube.com/watch?v=-ptMtJAdj40      ( Good example of open closed principle )
/*
In object-oriented programming, the open–closed principle (OCP) states "software entities (classes, modules, functions, etc.)
should be open for extension, but closed for modification";[1] that is, such an entity
can allow its behaviour to be extended without modifying its source code.
 */

// Use inheritance to achieve this goal, and the child classes with different functionality but same behavior implement the interface.
// whenever you have lots of if/else or switch statements always there will be violation of the open closed principle.
// we use interfaces for OC principle, because interfaces are closed for modification.
//At first thought that might sound quite academic and abstract.
// What it means though is that we should strive to write code that doesn't have to be changed every time the requirements change.




// not have to change the already tested code again and again in future, thats why we want to close the code for modification.
// extend functionalty, should be added,




// Do Implement Example.

// Constructor Injection is the best example of open-closed principle.