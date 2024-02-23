package ao.com.angolar.api.controller;

import ao.com.angolar.api.Dto.ProductDTO;
import ao.com.angolar.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> findAll() {

        List<ProductDTO> dto = productService.findAll();

        return ResponseEntity.status(HttpStatus.OK)
                .body(dto);
    }
}
