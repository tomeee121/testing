package TomaszB;

import java.util.ArrayList;
import java.util.List;

public class Car implements CarService{

    private int speed;
    private String model;
    private List<Car> cars = new ArrayList<>();

    public Car() {
    }

    public Car(int speed, String model) {
        this.speed = speed;
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    @Override
    public String description() {
        return "Car{" +
                "speed=" + speed +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public void add(Car... car) {
        for (Car car1 : car) {
            this.cars.add(car1);
        }
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }
}
