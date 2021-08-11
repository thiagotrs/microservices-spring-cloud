package one.digitalinnovation.shoppingcart.repository;

import org.springframework.data.repository.CrudRepository;

import one.digitalinnovation.shoppingcart.model.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer> {

    Cart findByCustomerId(Integer customerId);

}