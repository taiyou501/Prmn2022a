package lecture04;

import java.util.Scanner;
import java.util.ArrayList;


public class Account {
    //各変数をprivateで設定
    private String name;
    private String number;
    private long balance;

    //コンストラクタ
    Account(String name, String number){
        this.name = name;
        this.number = number;
        this.balance = 0;
    }

    //ここからセッターとゲッター
    public void set1Balance(long money){
        this.balance = balance + money;
    }

    public void set2Balance(long money){
        this.balance = balance - money;
    }

    public String getName(){
        return name;
    }

    public String getNumber(){
        return number;
    }

    public long getBalance(){
        return balance;
    }
}
