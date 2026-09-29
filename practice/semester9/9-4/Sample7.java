//別のコンストラクタを呼び出す

//車クラス
class Car {
    private int num;
    private double gas;

    private Car()//コンストラクタです
    {
        this(n, g);
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");
    }

    public Car(int n, double g) {
        //this();//上のコンストラクタで表示される処理を呼び出すよ。先頭必須！！
        num = n;
        gas = g;
        System.out.println("ナンバー" + num + "ガソリン量" + gas + "にしました");
    }
    public void show(){
        System.out.println("車のナンバーは"+num+"です");
        System.out.println("ガソリン量は"+gas+"です");
    }
}

class Sample7
{
    public static void main(String[] args)
    {
     /*   Car car1 = new Car();
        car1.show();    */

        Car car2 = new Car(1234,20.5);
        car2.show();

        Car car1 = new Car();
    }
}