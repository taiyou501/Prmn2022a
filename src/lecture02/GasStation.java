package lecture02;

public class GasStation {

    //給油を行う
    void refuel(Car car){
        car.fuel = car.fuel + 20;
        System.out.println("給油したことによりfuelが20増えました。");
    }
}
