package day02.cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarShopTest {

    CarShop carShop = new CarShop("Best Car", 10_000_000);

    @BeforeEach
    void init() {
        carShop.addCar(new Car("Lamborghini", 5.2, Color.BLACK, 10_300_000));
        carShop.addCar(new Car("Suzuki", 1.4, Color.RED, 1_500_000));
        carShop.addCar(new Car("Toyota", 1.4, Color.GREY, 2_700_000));
    }

    @Test
    void testCreateCarShop() {
        assertEquals("Best Car", carShop.getNameOfCarShop());
        assertEquals(10_000_000, carShop.getMaxPrice());
        assertEquals(2, carShop.getCarsForSell().size());
    }

    @Test
    void testAddCarWithValidPrice() {
        boolean result = carShop.addCar(new Car("Toyota", 1.2, Color.BLACK, 2_300_000));
        assertTrue(result);
        assertEquals(3, carShop.getCarsForSell().size());
        assertEquals("Suzuki", carShop.getCarsForSell().get(0).getBrand());
    }

    @Test
    void testAddCarWithInvalidPrice() {
        boolean result = carShop.addCar(new Car("Lamborghini", 5.2, Color.BLACK, 10_300_000));
        assertFalse(result);
        assertEquals(2, carShop.getCarsForSell().size());
    }

    @Test
    void testSumCarPrice() {
       assertEquals(4_200_000, carShop.sumCarPrice());
    }

    @Test
    void testNumberOfCarsCheaperThan() {
        assertEquals(1, carShop.numberOfCarsCheaperThan(2_000_000));
        assertEquals(0, carShop.numberOfCarsCheaperThan(1_000_000));
    }

    @Test
    void testCarsWithBrand() {
        assertEquals(1, carShop.carsWithBrand("Toyota").size());
        assertEquals(0, carShop.carsWithBrand("Ford").size());
    }
}
