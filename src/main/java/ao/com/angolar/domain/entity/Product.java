package ao.com.angolar.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table( name = "tb_products", uniqueConstraints = @UniqueConstraint(columnNames = {"name", "image"}))
public class Product {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id_product;
    private String name;
    private String description;
    private int currentQuantity;
    private double costPrice;
    private double salePrice;
    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private String image;
    private boolean is_activated;
    private boolean is_deleted;

//    private Category category;
}
