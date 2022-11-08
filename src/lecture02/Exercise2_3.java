package lecture02;

public class Exercise2_3 {
    public static void main(String[] args) {

        //Tireクラスを4つインスタンス化
        Tire[] tires = new Tire[4];
        for(Tire t : tires){
            t = new Tire(65);
        }

        //Engineクラスをインスタンス化
        Engine engine = new Engine(4000);

        //Car2クラスを、上記の内容を渡してインスタンス化
        Car2 car = new Car2(tires, engine);

        //GasStation2クラスをインスタンス化し、給油
        GasStation2 gasstation = new GasStation2();
        gasstation.refuel(car);

        //Car2のメソッドを実行
        car.startEngine();
        car.run();
    }
}
