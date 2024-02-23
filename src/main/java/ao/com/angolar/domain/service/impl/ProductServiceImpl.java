package ao.com.angolar.domain.service.impl;

import ao.com.angolar.api.Dto.ProductDTO;
import ao.com.angolar.domain.entity.Product;
import ao.com.angolar.domain.repository.ProductRepository;
import ao.com.angolar.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductDTO> findAll() {

        List<Product> products = productRepository.findAll();
        List<ProductDTO> dto = products.stream()
                .map( product -> new ProductDTO(product) ).toList();

        return dto;
    }

    @Override
    public ProductDTO create(Product product) {
        return null;
    }

    @Override
    public ProductDTO findById(Long id_product) {
        return null;
    }

    @Override
    public ProductDTO update(Product product) {
        return null;
    }

    @Override
    public void delete(Long id_product) {

    }
}
