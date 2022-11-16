package lecture04;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise4_2 {
    public static void main(String[] args) {
        //ATMクラスをインスタンス化
        ATM atm = new ATM();

        //指定したアカウントが存在するかを確認(登録前なので存在しません、と表示される)
        atm.print("山田太郎","01234");

        //アカウントの登録
        atm.registerAccount("山田太郎","01234");

        //指定したアカウントが存在するかを確認(登録後なので存在します、と表示される)
        atm.print("山田太郎","01234");

        //1000円を入金
        atm.deposit("01234",1000);

        //2000円を引き出そうとする(残高を超えるため失敗)
        atm.withdraw("01234",2000);

        //500円を引き出そうとする(残高を超えないため成功)
        atm.withdraw("01234",500);
    }
}
