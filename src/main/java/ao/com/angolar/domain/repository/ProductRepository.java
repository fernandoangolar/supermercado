package ao.com.angolar.domain.repository;

import ao.com.angolar.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
