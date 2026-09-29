//例外を送出する

class CarException extends Exception
{//例外クラスの宣言
}
//車クラス
class Car
{
    private int num;
    private double gas;

    public Car()
    {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");
    }
    public void setCar(int n,double g)throws CarException //例外を創出する可能性があるメソッドであることを宣言
    {
        if (g < 0) {
            CarException e = new CarException();
            throw e; //特定の場合に例外を送出します。
        } else {
            num = n;
            gas = g;
            System.out.println("ナンバーを" + num + "ガソリン量を" + gas + "にしました。");
        }
    }
        public void show(){
            System.out.println("車のナンバーは"+num);
            System.out.println("ガソリン量は"+gas);
        }
}
class Sample5
{
    public static void main(String[] args)throws CarException
    {
        Car car1 = new Car();
        car1.setCar(1234,-10.0);
        car1.show();
    }
}
//PS C:\Users\81704\IdeaProjects\JAVA-practice\practice\semester14\14-3> java Sample5
//車を作成しました。
//Exception in thread "main" CarException
//        at Car.setCar(Sample5.java:21)
//        at Sample5.main(Sample5.java:39)
//throwsを記述しt、そのメソッドを利用する呼び出し元のメソッドに例外処理を任せることを示している。

/*
class Sample5
{
    public static void main(String[] args)
    {
        Car car1 = new Car(); //carクラス型の変数の宣言かつ、そこにオブジェクトの生成かつコンストラクタの呼び出し。オブジェクトの場所をcar1に代入している
        try{
            car1.setCar(1234,-10.0);
    }
        catch(CarException e){
            System.out.println(e+"が送出されました。");
        }
        car1.show();
    }
}
/*　例外を送出刷る理由
1.不正なデータのまましょるすると破綻するため、それを防ぐため。
2．throw発生後はそれ以降の処理はストップするため、異常値に汚染されることがない
3．どこでラーに対応するかを呼び出し元に丸投げできる。ポップアップ表示させるとか、
 */