package lecture02;

public class Engine {
    int rpm;

    //コンストラクタ
    Engine(int rpm){
        this.rpm = rpm;
    }

    void start(){
        System.out.println("rpm = " + rpm + "でエンジンを始動させました。");
    }
}