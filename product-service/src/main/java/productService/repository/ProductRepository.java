package productService.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import productService.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}
