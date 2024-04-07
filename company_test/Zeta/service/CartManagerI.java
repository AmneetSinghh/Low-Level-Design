package company_test.Zeta.service;

import company_test.Zeta.model.CartItem;

import java.util.List;


// cal
// List< CartItems> cartItems.

// cartItems
public interface CartManagerI {
    void addItem(CartItem cartItem);
    void removeItem(CartItem cartItem);
    List<CartItem> viewCart();
}
