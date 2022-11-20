package lecture05;

public class Butterfly extends Insect{
    //Insectクラスのmove()をOverride
    @Override
    public void move(){
        System.out.println("飛んだよ");
    }
}
