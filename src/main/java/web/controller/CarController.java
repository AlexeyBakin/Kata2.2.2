package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping("/cars")
    public String printCarList(@RequestParam(value = "count", defaultValue = "5")Integer count, Model model) {
        List<Car> listCar = new ArrayList<>();
        listCar.add(new Car("Ferrari", "Red", 2021));
        listCar.add(new Car("Toyota", "Black", 2020));
        listCar.add(new Car("Nissan", "Blue", 2011));
        listCar.add(new Car("Kia", "Green", 2015));
        listCar.add(new Car("Mercedes", "White", 2022));
        model.addAttribute("listCar", CarService.countCar(listCar, count));
        return "cars";
    }
}