package web.service;

import web.models.Car;

import java.util.List;

public interface CarService {
    List<Car> listCars();
    List<Car> listCarsByCount(int count);
}
