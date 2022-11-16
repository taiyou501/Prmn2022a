package lecture04;

public class Fighter {

    //各変数をprivateで設定
    private int hitPoint;
    private int power;
    private String name;

    //コンストラクタ
    public Fighter(int hitPoint, int power, String name){
        this.hitPoint = hitPoint;
        this.power = power;
        this.name = name;
    }

    //Fighterが相手に攻撃
    public void attack(Fighter enemy){
        int i = enemy.getHitPoint() - power;//敵のhitPointを攻撃側のpower分減らす
        enemy.setHitPoint(i);//敵hitPointの更新
        System.out.println(name + " は " + enemy.getName() + " に " + power + " ダメージを与えた。");//ダメージ表示
        System.out.println(enemy.getName() + " の残り hitPoint : " + enemy.getHitPoint());//敵の残りhitPoint表示
    }

    //Fighterの生死を判定
    public boolean isAlive(){
        if(hitPoint > 0){
            return true;//生存
        }
        else{
            return false;//死亡
        }
    }

    //FighterのhitPointを取得
    public int getHitPoint(){
        return hitPoint;
    }

    //FighterのhitPointを更新
    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    //Fighterのnameを取得
    public String getName(){
        return name;
    }
}
