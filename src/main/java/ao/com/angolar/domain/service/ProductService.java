package ao.com.angolar.domain.service;

import ao.com.angolar.api.Dto.ProductDTO;
import ao.com.angolar.domain.entity.Product;

import java.util.List;

public interface ProductService {

    List<ProductDTO> findAll();
    ProductDTO create(Product product);
    ProductDTO findById(Long id_product);
    ProductDTO update (Product product);
    void delete(Long id_product);
}
