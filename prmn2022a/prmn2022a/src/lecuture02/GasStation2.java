package lecuture02;

public class GasStation2 {

    void refuel(Car2 car){
        car.fuel = 20;
        System.out.println("給油したことによりfuelが" + car.fuel + "増えました。");
    }

}
