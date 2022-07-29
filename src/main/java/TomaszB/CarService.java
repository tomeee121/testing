package TomaszB;

import java.util.List;

public interface CarService {
    String description();
    void add(Car... car);
    List<Car> getCars();
}
