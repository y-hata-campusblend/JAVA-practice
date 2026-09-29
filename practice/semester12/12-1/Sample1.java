//抽象クラスを利用する

//乗り物クラス
abstract class Vehicle
{
    protected int speed;
    public void setSpeed(int s)
    {
        speed = s;
        System.out.println("速度を"+speed+"にしました。");
    }
    abstract void show();
}
//車クラス
class Car extends Vehicle
{
    private int num;
    private double gas;

    public Car(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("ナンバー"+num+"ガソリン量"+gas+"車を作成しました。");
    }
    public void show()
    {
        System.out.println("車のナンバーは"+num);
        System.out.println("ガソリン量は"+gas);
        System.out.println("速度は"+speed);
    }
}

//飛行機クラス
class Plane extends Vehicle
{
    private int flight;

    public Plane(int f)
    {
        flight = f;
        System.out.println("便"+flight+"の飛行機を作成しました。");
    }
    public void show(){
        System.out.println("飛行機の便は"+flight+"です。");
        System.out.println("速度は"+speed+"です。");
    }
}
class Sample1
{
    public static void main(String[] args){
        Vehicle[] vc = new Vehicle[2];

        vc[0] = new Car(1234,20.5);
        vc[0].setSpeed(60);

        vc[1] = new Plane(232);
        vc[1].setSpeed(500);

        for(int i=0; i<vc.length; i++)
        {
            vc[i].show();
        }
    }
}

/*
1. 抽象クラスを使わなかった場合（困るパターン）
円クラス（Circle）と四角形クラス（Rectangle）を、それぞれ自由に作ったとします。
円クラスのメソッド名： drawCircle()
四角形クラスのメソッド名： drawSquare()
このように開発者がバラバラな名前でメソッドを作ってしまうと、プログラム側はこれらを「まったく別の種類の存在」としてしか扱えません.
図形が100種類に増えたら、100回それぞれ違うメソッド名を呼ぶ必要があり、配列に入れてループで一括処理する（＝まとめて扱う）こともできません。

2. 抽象クラスを使った場合（スッキリ解決！）
そこで、親として抽象クラス Shape（図形） を用意し、「図形グループのルール」を作ります。
このルールに従って、子クラスを作ります。
円クラス（Circle）： draw() をオーバーライドして「〇を描く処理」を書く
四角形クラス（Rectangle）： draw() をオーバーライドして「□を描く処理」を書く
何がすごいの？（＝「まとめて扱える」の意味）
どちらも「Shape」という共通の親を持ち、「絶対に draw() という同じ名前のボタン（メソッド）を持っている」 ことが保証されます。
そのため、画面を描くプログラム側は、中身が円なのか四角形なのかを気にする必要がなくなります。

 */