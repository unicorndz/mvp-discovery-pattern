package io.unicorn.qb.web.rest;

/**
 * Created by Abderrazak BOUADMA
 *
 * @since 4/17/17.
 */
public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(Long id) {
        super("Product with id " + id + " doesn't exist");
    }
}
