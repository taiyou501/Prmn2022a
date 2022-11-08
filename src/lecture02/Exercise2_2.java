package lecture02;

public class Exercise2_2 {
    public static void main(String[] args) {
        //クラスの呼び出し
        Car c = new Car();
        GasStation g = new GasStation();

        //燃料の初期値を設定
        c.fuel = 0;

        //走る(失敗)→給油→走る(成功)
        c.run();
        g.refuel(c);
        c.run();
    }
}
