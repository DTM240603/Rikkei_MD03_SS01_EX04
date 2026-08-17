package re.edu.ex01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/api/products")
    public List<Product> getAllProducts() {
        return List.of(
                new Product(1, "Laptop Dell", BigDecimal.valueOf(1500)),
                new Product(2, "iphone 15", BigDecimal.valueOf(1200)),
                new Product(3, "Chuột Logitech", BigDecimal.valueOf(25))
        );
    }
}
