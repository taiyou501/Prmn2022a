package lecture04;

public class Fighter {

    //各変数をprivateで設定
    private int hitPoint;
    private int power;
    private String name;

    //コンストラクタ
    public Fighter(int hitpoint, int power, String name){
        this.hitPoint = hitPoint;
        this.power = power;
        this.name = name;
    }

    public void attack(Fighter enemy){
        enemy.hitPoint = enemy.hitPoint -
    }

    public boolean isAlive(){

    }

    public int getHitPoint(){

    }

    public void setHitPoint(int hitPoint){

    }

    public String getName(){

    }
}
