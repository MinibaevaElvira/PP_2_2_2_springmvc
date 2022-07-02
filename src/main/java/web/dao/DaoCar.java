package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class DaoCar {
    public List<Car> listOfCar() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("BMW Isetta 300", "Germany", 1956));
        list.add(new Car("Mohs Ostentatienne Opera Sedan", "USA", 1967));
        list.add(new Car("Messerschmitt KR175", "Germany", 1953));
        list.add(new Car("Mazda R630", "Japan", 1960));
        list.add(new Car("Russo-Baltique Impression", "Russian and Germany", 2006));
        return list;
    }
    public List<Car> showOfCar(int count) {
        return listOfCar().stream().limit(count).toList();
    }
}
