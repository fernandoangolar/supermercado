package ao.com.angolar.domain.entity;

import java.math.BigDecimal;

public class Item_order {

    private Long id_item_order;
    private BigDecimal quantity;
    private Order order;
    private Product product;
    private BigDecimal unitPrice;
}
