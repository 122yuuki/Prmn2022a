package lecuture02;

public class Car2 {

    int fuel;
    Tire[] tires;
    Engine engine ;

    Car2(Tire[] tires,Engine engine){
            this.tires = tires;
            this.engine = engine;
    }

    void run() {
        if (fuel <= 0) {
            System.out.println("燃料不足です。給油してください。");
        }else {
            fuel--;
            System.out.println("燃料を1消費して走りました。");
            }
    }

    void startEngine(){
        engine.start();
    }
}
