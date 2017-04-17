package io.unicorn.qb.repository;

import io.unicorn.qb.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Abderrazak BOUADMA
 *
 * @since 4/17/17.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
