package lecture03;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise3_2 {
    public static void main(String[] args) {

        //標準入力の準備
        Scanner input = new Scanner(System.in);

        //入力する行数を入力
        System.out.println("何行分入力しますか？");
        int gyousuu = input.nextInt();

        //指定された行数分、文章を入力
        ArrayList<String> inputStrings = new ArrayList<>();
        for(int i = 0; i < gyousuu; i++) {
            System.out.println((i+1) + "行目:");
            String bunnsyou = input.next();
            inputStrings.add(bunnsyou);
        }

        //入力された文章を順番に表示
        System.out.println("入力した文字列:");
        int a = 0;
        for(String s : inputStrings){
            System.out.print("[" + a + "]");
            System.out.println(s);
            a++;
        }
    }
}
