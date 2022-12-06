package lecture06;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise6_2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> dice = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            dice.add(rand.nextInt(6) + 1);
        }
        System.out.println("さいころを5つ振りました．");
        System.out.print("何番目のさいころの値を確認しますか？");
        try{
            int index = input.nextInt();
            System.out.println(index + "番目のさいころの値は" + dice.get(index).intValue());
            } catch(IndexOutOfBoundsException e){
            System.out.println("ArrayListの範囲外アクセスを確認しました．");
            System.out.println("プログラムを終了します．");
        }
    }
}