package TomaszB;

import java.util.ArrayList;
import java.util.List;

public class Motor extends Car{
    private List<Motor> motors = new ArrayList<>();
    private int capacityOfPassengers;

    public Motor() {
    }

    public Motor(int speed, String model) {
        super(speed, model);
    }

    public Motor(int speed, String model, int capacityOfPassengers) {
        super(speed, model);
        this.capacityOfPassengers = capacityOfPassengers;
    }
    public void add(Motor motor){
        motors.add(motor);
    }

    public List<Motor> getMotors() {
        return motors;
    }

    public void setMotors(List<Motor> motors) {
        this.motors = motors;
    }

    public int getCapacityOfPassengers() {
        return capacityOfPassengers;
    }

    public void setCapacityOfPassengers(int capacityOfPassengers) {
        this.capacityOfPassengers = capacityOfPassengers;
    }

    @Override
    public String description(){
        return "Szybkość "+getSpeed()+" model: "+getModel()+ " liczba pasazerow: "+capacityOfPassengers;
    }

}
