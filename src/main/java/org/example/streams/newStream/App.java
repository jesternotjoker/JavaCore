package org.example.streams.newStream;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota Camry", 25000));
        cars.add(new Car("BMW X5", 75000));
        cars.add(new Car("Ford Mustang", 35000));
        cars.add(new Car("Honda Civic", 22000));
        cars.add(new Car("Mercedes-Benz E-Class", 68000));
        cars.add(new Car("Tesla Model 3", 40000));
        cars.add(new Car("Volkswagen Golf", 23000));
        cars.add(new Car("Audi A4", 33000));
        cars.add(new Car("Nissan Altima", 24000));
        cars.add(new Car("Lexus RX", 50000));


        Integer reduce = cars.stream()
                .reduce(0, (acc, car) -> acc + car.getPrice(), Integer::sum);


        System.out.println(reduce);
        System.out.println();

        String reduce1 = cars.stream()
                .map(c -> c.getModel())
                .reduce("models : ", (acc,m)-> acc  + m + ",",  String::concat);

        System.out.println(reduce1.substring(0, reduce1.length()-1));





    }
}


class Car {
    private String model;
    private int price;

    // Конструктор
    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }

    // Геттеры и сеттеры
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // Переопределяем метод toString для удобного вывода
    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

}