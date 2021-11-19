package day02.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    Car car1= new Car("Toyota", 1.2, Color.BLACK, 2_300_000);;

    @Test
    void testCreateCar() {
        Car car = new Car("Toyota", 1.2, Color.BLUE, 120);
        assertEquals("Toyota", car.getBrand());
        assertEquals(1.2, car.getEngine());
        assertEquals(Color.BLUE, car.getColor());
        assertEquals(120, car.getPrice());
    }

    @Test
    void testDecreasePrice() {
        car1.decreasePrice(1);
        assertEquals(2_277_000, car1.getPrice());
        car1.decreasePrice(99);
        assertEquals(22_770, car1.getPrice());
    }

    @Test
    void testDecreasePriceWithWrongPercent() {
        car1.decreasePrice(-90);
        assertEquals(2_300_000, car1.getPrice());
        car1.decreasePrice(0);
        assertEquals(2_300_000, car1.getPrice());
        car1.decreasePrice(100);
        assertEquals(2_300_000, car1.getPrice());
    }
}
