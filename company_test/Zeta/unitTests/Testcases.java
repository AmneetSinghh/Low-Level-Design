package company_test.Zeta.unitTests;

import company_test.Zeta.model.CartItem;
import company_test.Zeta.service.states.AcceptMoneyState;
import company_test.Zeta.service.states.VendingMachineState;

public class Testcases {

    public void testAcceptMoneyStateAddCart(){
        VendingMachineState vendingMachineState = new AcceptMoneyState();
        try{
            vendingMachineState.addItemIntoCart(new CartItem("item1"));
            System.out.println("Test failed");
        } catch(Exception e){
            System.out.println("Test passed");
        }
    }

    public void testAcceptMoneyStateRemoveCart(){
        VendingMachineState vendingMachineState = new AcceptMoneyState();
        try{
            vendingMachineState.removeItemFromCart(new CartItem("item1"));
            System.out.println("Test failed");
        } catch(Exception e){
            System.out.println("Test passed");
        }
    }

    public void testAcceptMoneyStateViewCart(){
        VendingMachineState vendingMachineState = new AcceptMoneyState();
        try{
            vendingMachineState.viewCart();
            System.out.println("Test failed");
        } catch(Exception e){
            System.out.println("Test passed");
        }
    }



}
