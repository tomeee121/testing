package TomaszB;

import java.util.ArrayList;
import java.util.List;

public class F1 extends Car{

    private List<F1> f1s = new ArrayList<>();
    private int pressureForce;

    public void add(F1 f1){
        f1s.add(f1);
    }

    public F1() {
    }


    public F1(int speed, String model, int pressureForce) {
        super(speed, model);
        this.pressureForce = pressureForce;
    }

    public F1(int speed, String model) {
        super(speed, model);
    }

    public List<F1> getF1s() {
        return f1s;
    }

    public int getPressureForce() {
        return pressureForce;
    }


    @Override
    public String description(){
        return "siła docisku "+pressureForce+" model: "+getModel()+ " max szybkość: "+getSpeed();
    }
}
