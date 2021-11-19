package day02.cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {

    private String nameOfCarShop;
    private int maxPrice;
    private List<Car> carsForSell = new ArrayList<>();

    public CarShop(String nameOfCarShop, int maxPrice) {
        this.nameOfCarShop = nameOfCarShop;
        this.maxPrice = maxPrice;
    }

    public boolean addCar(Car car) {
        if (car.getPrice() <= maxPrice) {
            carsForSell.add(car);
            return true;
        } else {
            return false;
        }
    }

    public int sumCarPrice() {
        int sumPriceOfCar = 0;
        for (Car car: carsForSell) {
            sumPriceOfCar += car.getPrice();
        }
        return sumPriceOfCar;
    }

    public int numberOfCarsCheaperThan(int price) {
        int numberOfCars = 0;
        for (Car car: carsForSell) {
            if (car.getPrice() <= price) {
                numberOfCars ++;
            }
        }
        return numberOfCars;
    }

    public List<Car> carsWithBrand(String brand) {
        List<Car> carBrand = new ArrayList<>();
        for (Car car: carsForSell) {
            if (brand.equals(car.getBrand())) {
                carBrand.add(car);
            }
        }
        return carBrand;
    }

    public String getNameOfCarShop() {
        return nameOfCarShop;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public List<Car> getCarsForSell() {
        return carsForSell;
    }
}
