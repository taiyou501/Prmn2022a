package lecture05;

import java.util.ArrayList;

public class Exercise5_7 {
    public static void main(String[] args) {
        ArrayList<Insect> insect = new ArrayList<>();
        insect.add(new Insect());
        insect.add(new Butterfly());
        insect.add(new Locust());
        insect.add(new SwallowtailButterfly());

        for(Insect i : insect){
            i.move();
        }
    }


}
