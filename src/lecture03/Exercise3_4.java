package lecture03;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise3_4 {
    public static void main(String[] args) {

        //ArrayListを用いて、Vegetableクラスをまとめてインスタンス化
        ArrayList<Vegetable> yasai = new ArrayList<>();
        yasai.add(new Vegetable("にんじん", 117));
        yasai.add(new Vegetable("たまねぎ", 120));
        yasai.add(new Vegetable("じゃがいも", 154));

        //printメソッドを呼び出す
        for(Vegetable v : yasai){
            v.print();
        }
    }
}
