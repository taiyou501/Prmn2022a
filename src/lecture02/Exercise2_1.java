package lecture02;

public class Exercise2_1 {
    public static void main(String[] args) {
        //1回目のHumanの呼び出し
        Human h1 = new Human();
        h1.name = "たかし";
        h1.age = 18;
        h1.print();

        //2回目のHumanの呼び出し
        Human h2 = new Human();
        h2.name = "ひろし";
        h2.age = 20;
        h2.print();
    }
}
