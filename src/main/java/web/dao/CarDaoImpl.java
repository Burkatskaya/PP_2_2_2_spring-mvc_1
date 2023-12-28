package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


@Component
public class CarDaoImpl implements CarDao {
    private static int CARS_COUNT;

    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++CARS_COUNT, "Model1", "111"));
        cars.add(new Car(++CARS_COUNT, "Model2", "222"));
        cars.add(new Car(++CARS_COUNT, "Model3", "333"));
        cars.add(new Car(++CARS_COUNT, "Model4", "444"));
        cars.add(new Car(++CARS_COUNT, "Model5", "555"));
    }

    @Override
    public List<Car> listCars() {
        return cars;
    }

    @Override
    public List<Car> listCarsByCount(int count) {
        return count > 0 && count < 5
                ? IntStream.range(0, cars.size())
                        .limit(count)
                        .mapToObj(cars::get)
                        .collect(Collectors.toList())
                : cars;
    }
}
