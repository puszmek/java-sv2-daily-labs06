package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testCreateProduct() {
        Product product = new Product("Milk", Type.DIARY, 0.7);
        assertEquals("Milk", product.getName());
        assertEquals(Type.DIARY, product.getType());
        assertEquals(0.7, product.getPrice(), 0.05);
    }

}