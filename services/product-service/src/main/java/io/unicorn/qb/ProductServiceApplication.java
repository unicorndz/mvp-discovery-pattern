package io.unicorn.qb;

import io.unicorn.qb.domain.Product;
import io.unicorn.qb.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"io.unicorn.qb.repository"})
public class ProductServiceApplication {

    @Autowired
    ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner() {
        return new CommandLineRunner() {
            public void run(String... strings) throws Exception {
                Product product = new Product();
                product.setName("One +1");
                productRepository.save(product);

                product = new Product();
                product.setName("iPhone");
                productRepository.save(product);

                product = new Product();
                product.setName("Xbox360");
                productRepository.save(product);

                product = new Product();
                product.setName("Play Station");
                productRepository.save(product);
            }
        };
    }
}
