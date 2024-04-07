package company_test.Zeta.service.states;

import company_test.Zeta.enums.Coin;
import company_test.Zeta.exceptions.ItemNotFoundException;
import company_test.Zeta.model.CartItem;

import java.util.List;

public class AcceptMoneyState implements VendingMachineState{

    // adding coins.
    @Override
    public void addCoins(Coin coin) {
        ///
    }

///         changeToCartState.VendingMachineState = cartState()
    // after that we can do these things ( adding remove into carts )
    @Override
    public void addItemIntoCart(CartItem cartItem) {
        throw new ItemNotFoundException("items can't be added");
    }

    @Override
    public void removeItemFromCart(CartItem cartItem) throws Exception {
        throw new ItemNotFoundException("items can't be removed");
    }

    @Override
    public List<CartItem> viewCart() throws Exception {
        throw new ItemNotFoundException("can't view");
    }

    @Override
    public void submit() throws Exception {
        throw new Exception("can't submit the items");
    }

    @Override
    public void dispense() throws Exception {
        throw new Exception("Can't dispense the items");
    }

    @Override
    public void remainingChange() {

    }

    @Override
    public void cancelTransaction() {

    }
}
