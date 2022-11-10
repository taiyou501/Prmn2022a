package lecture03;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise3_3 {
    public static void main(String[] args) {

        //標準入力の準備
        Scanner input = new Scanner(System.in);

        //文字列を2回入力し、int型に変換する
        ArrayList<Integer> inputNum = new ArrayList<>();
        for(int i = 0; i < 2; i++){
            System.out.println((i+1) + "つ目の整数を入力してください:");
            String num = input.next();
            int n = Integer.parseInt(num);
            inputNum.add(n);
        }

        //2つの数の和を表示
        int sum = 0;
        for(Integer num : inputNum){
            sum = sum + num;
        }
        System.out.println(inputNum.get(0) + " + " + inputNum.get(1) + " = " + sum);
    }
}
