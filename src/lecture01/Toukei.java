package lecture01;

public class Toukei {

    //最大値を返すメソッド
    int max(int[] a){
        int max = 0;
        for(int i = 0; i < a.length; i++){
            if(max < a[i]){
                max = a[i];
            }
        }
        return max;
    }

    //最小値を返すメソッド
    int min(int[] a){
        int min = 99999;
        for(int i = 0; i < a.length; i++){
            if(min > a[i]){
                min = a[i];
            }
        }
        return min;
    }

    //平均値を返すメソッド
    double average(int[] a){
        double sum = 0;
        for(int i = 0; i < a.length; i++){
            sum = sum + a[i];
        }
        return sum / a.length;
    }
}
