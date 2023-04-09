package com.cydeo.bootstrap;

import com.cydeo.entity.Car;
import com.cydeo.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;

public class DataGenerator implements CommandLineRunner {

    private final CarRepository carRepository;

    public DataGenerator(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Car c1 = new Car("BMW", "M3");
        Car c2 = new Car("Honda","Civic");
        Car c3 = new Car("Toyota","Corolla");


        //CarRepository interface has save service
        //if we want to use a method in another class then we need DI

        carRepository.save(c1);
        carRepository.save(c2);
        carRepository.save(c3);
    }
}
