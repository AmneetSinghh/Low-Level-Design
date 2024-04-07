package company_test.Zeta.service.states;

import company_test.Zeta.enums.Coin;
import company_test.Zeta.model.CartItem;

import java.util.List;

public class SubmitState implements VendingMachineState {
    @Override
    public void addCoins(Coin coin){

    }

    @Override
    public void addItemIntoCart(CartItem cartItem) {

    }

    @Override
    public void removeItemFromCart(CartItem cartItem) {

    }

    @Override
    public List<CartItem> viewCart() {
        return null;
    }

    @Override
    public void submit() {

    }

    @Override
    public void dispense() {

    }

    @Override
    public void remainingChange() {

    }

    @Override
    public void cancelTransaction() {

    }
}
