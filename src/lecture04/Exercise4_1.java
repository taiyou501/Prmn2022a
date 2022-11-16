package lecture04;

public class Exercise4_1 {
    public static void main(String[] args) {
        //Fighterを2体生成
        Fighter f1 = new Fighter(210,100,"Fighter1");
        Fighter f2 = new Fighter(180,150,"Fighter2");

        //どちらか一方のFighterが倒れるまで互いに攻撃しあう
        while(true){
            f1.attack(f2);
            boolean hantei2 = f2.isAlive();
            if(hantei2 == false){
                System.out.println(f2.getName() + " は倒れた。");//f1の勝ち
                break;
            }
            f2.attack(f1);
            boolean hantei1 = f1.isAlive();
            if(hantei1 == false){
                System.out.println(f1.getName() + " は倒れた。");//f2の勝ち
                break;
            }
        }
    }
}
