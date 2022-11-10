package lecture03;

public class Vegetable {
    //野菜の名前
    String name;
    //値段
    int value;

    //コンストラクタ
    Vegetable(String name, int value){
        this.name = name;
        this.value = value;
    }

    //野菜の名前と値段を表示
    void print(){
        System.out.println(name + "は" + value + "円");
    }
}
