//メソッドをオーバーライドする

//車クラス
class Car
{
    protected  int num;
    protected double gas;

    public Car()
    {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました");
    }
    public void setCar(int n,double g)
    {
        num = n;
        gas = g;
        System.out.println("ナンバーを"+num+"ガソリン量を"+gas+"にしました。");
    }
    public void show()
    {
        System.out.println("車のナンバーは"+num+"です。");
        System.out.println("ガソリン量は"+gas+"です。");
    }
}
//レーシングカークラス
class RacingCar extends Car
{
    private int course;

    public RacingCar()
    {
        course = 0;
        System.out.println("レーシングカーを作成しました。");
    }
    public void setCourse(int c)
    {
        course = c;
        System.out.println("コース番号を"+course+"にしました。");
    }
    public void show(){
        System.out.println("レーシングカーのナンバーは"+num+"です。");
        System.out.println("ガソリン量は"+gas+"です。");
        System.out.println("コース番号は"+course+"です。");
    }
}
class Sample4
{
    public static void main(String[] args)
    {
        RacingCar rccar1 = new RacingCar();

        rccar1.setCar(1234,20.5);
        rccar1.setCourse(5);

        rccar1.show();//carクラスにもracingcarクラスにもshow();メソッド（メソッド名、引数の数、型が全く同じ）がある！
        //その場合はサブクラスのほうが機能する。＝スーパークラスに代わって機能することを　オーバーライドという！！！
    }
}

/*Car　car1 = new RacingCar()
car1.setcar(1234,20.5);
car1.show();
本体（中身）： RacingCar なので、コース番号などのデータや機能はしっかり持っている。→その場合は、本体のほうのオーバーライドが実施される。
接続されている型（リモコン）： Car クラスだから、ボタンとしては Car にあるもの（show() など）しか用意されていない。
結果： Car型のリモコンには setCourse() ボタンが存在しないので、直接 setCourse() を呼び出すのは無理（エラーになる）。*/