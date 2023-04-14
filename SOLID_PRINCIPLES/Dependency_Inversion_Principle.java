package SOLID_PRINCIPLES;
public class Dependency_Inversion_Principle {

    public static void main(String[] args) {

        System.out.println("******   Dependency Inversion Principle   ******");
    }

}

//https://www.youtube.com/watch?v=9oHY5TllWaU&t=28s
//https://www.tutorialsteacher.com/ioc/dependency-inversion-principle#:~:text=In%20our%20example%2C%20CustomerBusinessLogic%20depends,classes%20should%20depend%20on%20abstraction.
/*
1. High level modules. or the low level modules in your code should not depend on the actual implementation, they should depend on abstractions.
2. We implement abstractions using interfaces, watch above video for exampl,e
3. lets say we have store that uses stripe api for payments, so store is dpeended on stripe api, if in future we want to change stripe to paypal then issues,
we need to change everywhere we useed that stripe api, so  basically in store calss we dpeended on implementation of stripe.
So higher level modeules examle store needs toCandidate_Master_willbe depend on abstractions/  interface not actual classs implementatioon.. So we make new paymewnt processor wrapper for stripe api.
so payment processor is class or interface that is the intermediate layer. So now store use payment processor.

//https://medium.com/@kedren.villena/simplifying-dependency-inversion-principle-dip-59228122649a  good exmaple

NOTE : so basically low level module bahut jahaj use hunda, apa chande hai jithe v use ho rea hove oh class is low level module t dependent na hove. because low level module if change hogya, then har jagah cahange krne pene jithe low level module use hoya si.
 */







// Do Implement it.