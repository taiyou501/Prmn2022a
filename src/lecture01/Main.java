package lecture01;

public class Main {
    public static void main(String[] args) {
        //課題1-1
        System.out.println("b2212160 Yusuke Honma");

        //課題1-2
        int studentNumber = 2212160;
        System.out.println("b" + studentNumber + " Yusuke Honma");

        //課題1-3
        int age = 29;
        if (age < 20) {
            System.out.println("I am " + age + " years old so I cannot drink liquor.");
        } else {
            System.out.println("I am " + age + " years old so I can drink liquor.");
        }

        //課題1-4
        int[] array = new int[100];
        int sum = 0;

        //回数が決まっている繰り返し処理のため、for文を使用
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            sum = sum + array[i];
        }

        //課題1-5
        int[] score = {41, 85, 72, 38, 80};

        //各要素の点数を表示
        for (int i = 0; i < score.length; i++) {
            if (score[i] >= 90 && score[i] <= 100) {
                System.out.println(i + "番 " + score[i] + " 秀");
            } else if (score[i] >= 80) {
                System.out.println(i + "番 " + score[i] + " 優");
            } else if (score[i] >= 70) {
                System.out.println(i + "番 " + score[i] + " 良");
            } else if (score[i] >= 60) {
                System.out.println(i + "番 " + score[i] + " 可");
            } else {
                System.out.println(i + "番 " + score[i] + " 不可");
            }
        }

        //最高点、最低点、平均点を表示
        Toukei t = new Toukei();
        int max = t.max(score);
        System.out.println("最高点:" + max + "点");
        int min = t.min(score);
        System.out.println("最低点:" + min + "点");
        double ave = t.average(score);
        System.out.println("平均点:" + ave + "点");
    }
}
