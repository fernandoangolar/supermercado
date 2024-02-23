package ao.com.angolar.api.Dto;

import ao.com.angolar.domain.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private Long id_product;
    private String name;
    private String description;
    private String price;

    public ProductDTO (Product product) {
        this.id_product = product.getId_product();
        this.name = product.getName();
        this.description = product.getDescription();
        this.price = product.getPrice();
    }
}
