package web.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private String model;
    private String color;
    private int year;

    public Car(String name, String color, int year) {
        this.model = name;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("Car: name = %s, color = %s, year = %d", model, color, year);
    }
}