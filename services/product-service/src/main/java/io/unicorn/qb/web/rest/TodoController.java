package io.unicorn.qb.web.rest;

import io.unicorn.qb.domain.Product;
import io.unicorn.qb.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Abderrazak BOUADMA
 *
 * @since 4/17/17.
 */
@RestController
@RequestMapping("/products")
public class TodoController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/{id}")
    ResponseEntity<Product> findById(@PathVariable Long id) {
        if (productRepository.exists(id)) {
            return ResponseEntity.ok().body(productRepository.findOne(id));
        } else {
            throw new ProductNotFoundException(id);
        }
    }

    @GetMapping
    ResponseEntity<List<Product>> findAll() {
        return ResponseEntity.ok().body(productRepository.findAll());
    }
}
