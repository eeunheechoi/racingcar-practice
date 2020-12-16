package race;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Race {

    private List<Car> cars;
    private final static int MAX_NUMBER = 10;
    private final static int MIN_NUMBER = 0;


    public boolean validateNumber(int number) {
        return MIN_NUMBER >= 0 && MAX_NUMBER < 10;
    }

    public int randomNumber() {
        Random randomNumber = new Random();
        return randomNumber.nextInt(9);
    }

    public void race( List<Car> cars) {

        this.cars = cars.stream()
                .map(car -> {
                    car.move(this.randomNumber());
                    return new Car(car.getMove());
                }).collect(Collectors.toList());

    }

    public List<Car> getCars() {
        return cars;
    }

}
