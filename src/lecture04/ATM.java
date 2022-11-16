package lecture04;

import java.util.ArrayList;

public class ATM {

    //privateでaccountListを定義
    private ArrayList<Account> accountList = new ArrayList<>();

    public void registerAccount(String name, String number){
        accountList.add(new Account(name,number));//アカウントの追加
        System.out.println(name + " さんのアカウントを口座番号:" + number + " で登録しました。");
    }

    public boolean existsAccount(String name, String number){
        for(Account a : accountList){
            if(name.equals(a.getName()) && number.equals(a.getNumber())){
                return true;//指定された情報の発見
            }
        }
        return false;//指定された情報が見つからない(失敗)
    }

    public void print(String name, String number){
        boolean flag = existsAccount(name, number);
        if(flag == true){
            System.out.println("名前:" + name + " 口座番号:" + number + " は存在します。");//成功
        }else{
            System.out.println("名前:" + name + " 口座番号:" + number + " は存在しません。");//失敗
        }
    }

    public void deposit(String number, long money){
        for(Account a : accountList) {
            if (number.equals(a.getNumber())) {
                a.set1Balance(money);//残高に指定された値(お金)の分を足す
                System.out.println("口座番号:" + a.getNumber() + " に " + money + " 円入金しました。");//入金成功
            }
        }
    }

    public void withdraw(String number, long money){
        for(Account a : accountList){
            if(number.equals(a.getNumber())){
                if(money <= a.getBalance()){//引き出そうとするお金が残高以下の場合
                    a.set2Balance(money);
                    System.out.println("口座番号:" + a.getNumber() + " から " + money + " 円引き出しました。残高:" + a.getBalance() + "円です。");
                    //出金成功
                }else{//引き出そうとするお金が残高を超える場合
                    System.out.println("口座番号:" + a.getNumber() + " から " + money + " 円引き出せませんでした。残高:" + a.getBalance() + "円です。");
                    //出金失敗
                }
            }
        }
    }
}
