package web.dao;

import web.models.Car;

import java.util.List;

public interface CarDao {
    List<Car> listCars();
    List<Car> listCarsByCount(int count);
}
