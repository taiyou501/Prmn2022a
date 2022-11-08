package lecture02;

public class GasStation2 {
    //給油を行う
    void refuel(Car2 car){
        car.fuel = car.fuel + 20;
        System.out.println("給油したことによりfuelが20増えました。");
    }
}
