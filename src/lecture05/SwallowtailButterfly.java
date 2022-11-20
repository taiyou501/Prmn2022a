package lecture05;

public class SwallowtailButterfly extends Butterfly{
    //Butterflyのmove()をOverride
    @Override
    public void move(){
        System.out.println("綺麗に飛んだよ");
    }
}
