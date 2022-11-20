package lecture05;

public class Locust extends Insect{
    //Insectクラスのmove()をOverride
    @Override
    public void move(){
        System.out.println("跳んだよ");
    }
}
