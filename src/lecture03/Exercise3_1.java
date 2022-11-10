package lecture03;

import java.util.Scanner;

public class Exercise3_1 {
    public static void main(String[] args) {
        System.out.print("任意の文字列を入力してください:");
        Scanner input = new Scanner(System.in);
        String mojiretu = input.nextLine();
        System.out.println("”" + mojiretu + "”" + " と入力されました。");
    }
}
