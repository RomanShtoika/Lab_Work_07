import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Car {
    private final String brand;
    private double enginePower;
    private Driver driver;
    private double price;
    private final int year;

    public Car(String brand, double enginePower, Driver driver, double price, int year) {
        this.brand = brand;
        this.enginePower = enginePower;
        this.driver = driver;
        this.price = price;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }
}

class Driver {
    private final String name;
    private final int age;
    private int drivingExperience;

    public Driver(String name, int age, int drivingExperience) {
        this.name = name;
        this.age = age;
        this.drivingExperience = drivingExperience;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void increaseDrivingExperience() {
        drivingExperience++;
    }
}

class TaxiServiceHelper {
    public static Car getRandomCar(List<Car> cars) {
        Random random = new Random();
        int index = random.nextInt(cars.size());
        return cars.get(index);
    }
}

public class Exercise_1{
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        // Створення 12 машинок
        Driver driver1 = new Driver("Taras", 45, 6);
        Car car1 = new Car("Honda", 137, driver1, 8500, 2011);
        cars.add(car1);

        Driver driver2 = new Driver("Yaroslav", 35, 1);
        Car car2 = new Car("Lexus", 120, driver2, 15000, 2012);
        cars.add(car2);

        Driver driver3 = new Driver("David", 29, 5);
        Car car3 = new Car("Dacia", 96, driver3, 4500, 2009);
        cars.add(car3);

        Driver driver4 = new Driver("Valentin", 24, 7);
        Car car4 = new Car("Mitsubishi", 140, driver4, 11000, 2008);
        cars.add(car4);

        Driver driver5 = new Driver("Andriy", 25, 5);
        Car car5 = new Car("Chevrolet", 107, driver5, 6800, 2007);
        cars.add(car5);

        Driver driver6 = new Driver("Roman", 20, 4);
        Car car6 = new Car("Tavria", 69, driver6, 1500, 2003);
        cars.add(car6);

        Driver driver7 = new Driver("Orest", 23, 4);
        Car car7 = new Car("Honda", 165, driver7, 11000, 2013);
        cars.add(car7);

        Driver driver8 = new Driver("Svitlana", 21, 3);
        Car car8 = new Car("Nissan", 115, driver8, 9000, 2013);
        cars.add(car8);

        Driver driver9 = new Driver("Bohdan", 19, 6);
        Car car9 = new Car("Skoda", 137, driver9, 8000, 2012);
        cars.add(car9);

        Driver driver10 = new Driver("Edward", 23, 4);
        Car car10 = new Car("Opel", 115, driver10, 6000, 2002);
        cars.add(car10);

        Driver driver11 = new Driver("Yura", 36, 5);
        Car car11 = new Car("BMW", 137, driver11, 9500, 2003);
        cars.add(car11);

        Driver driver12 = new Driver("Olena", 19, 5);
        Car car12 = new Car("Peugeot", 110, driver12, 8000, 2008);
        cars.add(car12);

        // Ремонт половини автопарку
        for (int i = 0; i < cars.size() / 2; i++) {
            Car car = cars.get(i);
            double increasedPower = car.getEnginePower() * 1.1;
            car.setEnginePower(increasedPower);

            Driver newDriver = new Driver("Новий водій " + (i + 1), 25, 1);
            car.setDriver(newDriver);
        }

        // Підвищення потужності та ціни кожної другої машини
        for (int i = 1; i < cars.size(); i += 2) {
            Car car = cars.get(i);
            double increasedPower = car.getEnginePower() * 1.1;
            double increasedPrice = car.getPrice() * 1.05;
            car.setEnginePower(increasedPower);
            car.setPrice(increasedPrice);
        }

        // Перевірка досвіду водіїв та відправлення на курси
        for (Car car : cars) {
            Driver driver = car.getDriver();
            if (driver.getDrivingExperience() < 5 && driver.getAge() > 25) {
                driver.increaseDrivingExperience();
            }
        }

        // Випадковий вибір машинки
        Car randomCar = TaxiServiceHelper.getRandomCar(cars);
        System.out.println("Автомобіль марки " + randomCar.getBrand() + " з водієм " + randomCar.getDriver().getName() + " виїхав за вами.");

        // Виведення повідомлення про прибуття водія
        System.out.println("Водій " + randomCar.getDriver().getName() + " прибув на місце.");
    }
}
