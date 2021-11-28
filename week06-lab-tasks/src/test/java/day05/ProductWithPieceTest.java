package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductWithPieceTest {

    ProductWithPiece productWithPiece = new ProductWithPiece(Type.BAKERY);

    @Test
    void testCreateProductWithPiece() {
        assertSame(Type.BAKERY, productWithPiece.getType());
        assertEquals(1, productWithPiece.getCount());
    }

    @Test
    void testIncrementCount() {
        productWithPiece.incrementCount();
        assertEquals(2, productWithPiece.getCount());
    }
}