package OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Chevrolet","Camaro",2022);
        System.out.println(car.getMake());
        car.setYear(2023);
        System.out.println(car.getYear());

    }
}
