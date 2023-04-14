package SOLID_PRINCIPLES;
public class Interface_Segmented_Principle {


    public static void main(String[] args) {

        System.out.println("******   Interface Segmented Principle   ******");
    }


}
//https://www.baeldung.com/java-interface-segregation
/*
1. Interfaces should be such, that client should not implement unnecessary functions they do not need.
2. interfaces segmented means : Interfaces ko little little tukdo mi baant do so that, child classes ko unnecessary functions implement na karne pade.
3. “Clients should not be forced to depend upon interfaces that they do not use.”
4. let suppose we have 1 interface that has 3 functions, and 2 classes that implements this interface. Now lets say we want to add new functionality, we added 2 more functions in existing interace, \
now the classes that already implements that interface have to faltu da implemnt kro, jab ki no need.


 */



// Implement example.