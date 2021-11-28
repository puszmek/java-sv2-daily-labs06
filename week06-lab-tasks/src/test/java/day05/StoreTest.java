package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {

    Store store = new Store();

    @BeforeEach
    void init() {
        store.addProduct(new Product("Milk", Type.DIARY, 0.7));
        store.addProduct(new Product("Butter", Type.DIARY, 2.3));
        store.addProduct(new Product("bread", Type.BAKERY, 1.0));
        store.addProduct(new Product("peas", Type.FROZEN, 2.2));
        store.addProduct(new Product("apple", Type.FRUIT, 1.4));
    }

    @Test
    void testAddProduct() {
        assertEquals(5, store.getProducts().size());
    }

    @Test
    void testNumberOfProductsByOneType() {
        List<ProductWithPiece> result = store.numberOfProductsByType();
        assertEquals(4, result.size());
        assertEquals(Type.DIARY, result.get(0).getType());
        assertEquals(Type.BAKERY, result.get(1).getType());
        assertEquals(Type.FROZEN, result.get(2).getType());
        assertEquals(Type.FRUIT, result.get(3).getType());
        assertEquals(2, result.get(0).getCount());
        assertEquals(1, result.get(1).getCount());
        assertEquals(1, result.get(2).getCount());
        assertEquals(1, result.get(3).getCount());
    }

    @Test
    void testNumberOfProductsByEmptyType() {
        Store store = new Store();
        List<ProductWithPiece> result = store.numberOfProductsByType();
        assertEquals(0, result.size());
    }
}
