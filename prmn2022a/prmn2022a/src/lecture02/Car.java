package lecture02;

public class Car {

    int fuel;
    Car(){
        fuel = 0;
    }

    void run(){
        if(fuel <= 0){
            System.out.println("燃料不足です。給油してください。");
        }
        else{
            fuel--;
            System.out.println("燃料を1消費して走りました。");
        }
    }



}
