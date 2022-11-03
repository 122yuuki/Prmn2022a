package lecuture02;

public class GasStation {

    void refuel(Car car){
        car.fuel = 20;
        System.out.println("給油したことによりfuelが" + car.fuel + "増えました。");
    }
}
