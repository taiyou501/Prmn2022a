package lecture02;

public class Car {
    int fuel;

    //コンストラクタ
    Car(){
        this.fuel = fuel;
    }

    //燃料で車を走らせる
    void run(){
        if(fuel <= 0){
            //失敗
            System.out.println("燃料が足りないため走れませんでした。");
        }else{
            //成功
            fuel = fuel - 1;
            System.out.println("燃料を1消費して走りました。");
        }
    }
}
