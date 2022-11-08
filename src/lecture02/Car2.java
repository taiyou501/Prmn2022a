package lecture02;

public class Car2 {
    int fuel;
    Tire[] tires;
    Engine engine;

    //コンストラクタ
    Car2(Tire[] tires, Engine engine){
        this.fuel = fuel;
        this.tires = tires;
        this.engine = engine;
    }

    //燃料で車を走らせる
    void run(){
        if(fuel <= 0){
            //失敗
            System.out.println("燃料が足りないため走れませんでした。");
        }else{
            //成功
            fuel = fuel - 1;
            System.out.println("fuelを1消費して走りました。");
        }
    }

    void startEngine(){
        engine.start();
    }
}
