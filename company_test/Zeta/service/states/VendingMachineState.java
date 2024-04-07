package company_test.Zeta.service.states;

import company_test.Zeta.enums.Coin;
import company_test.Zeta.model.CartItem;

import java.util.List;

public interface VendingMachineState {
    void addCoins(Coin coin) throws Exception;
    void addItemIntoCart(CartItem cartItem) throws Exception;
    void removeItemFromCart(CartItem cartItem) throws Exception;
    List<CartItem> viewCart() throws Exception;
    void submit() throws Exception;// check inventory and all validations.
    void dispense() throws Exception;// remaining change.
    void remainingChange();
    void cancelTransaction();
}
